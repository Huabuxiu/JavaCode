package 剑指offer;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-05 19:14
 **/

//题目描述请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
public class replaceSpace {
    public String replaceSpace(StringBuffer str) {
        if (str==null)
            return null;
        StringBuilder string = new StringBuilder();
        for (int i= 0;i<str.length();i++)
        {
            if (str.charAt(i)==' '){
                string.append('%');
                string.append('2');
                string.append('0');
            }else
                string.append(str.charAt(i));
        }
        return string.toString();
    }
}
