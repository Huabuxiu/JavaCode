package LeetCode.String;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-16 09:43
 **/
public class ReverseString {
    public String reverseString(String s) {
            char[] arr = s.toCharArray();
            int i = 0, j = arr.length - 1;
            while(i < j){
                char tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }

            String str = String.valueOf(arr);
            return str;
        }
}
