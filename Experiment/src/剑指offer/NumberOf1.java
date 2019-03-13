package 剑指offer;

/**
 * @program: Experiment
 * @description:求一个数的二进制表示中有多少个1
 *
 * 让0000 00001 和这个数做与运算，结果不为零，计数加一，左移一位，
 * @author: Huabuxiu
 * @create: 2019-03-09 23:30
 **/
public class NumberOf1 {
    public int NumberOf1(int n) {
        int flag = 1;
        int count=0;
        while (flag !=0){
            if ((n&flag)!=0)        //查看当前位有是否为1
            {
                count++;
            }
            flag = flag <<1;
        }
        return count;
    }
}
