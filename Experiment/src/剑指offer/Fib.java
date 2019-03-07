package 剑指offer;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-07 11:17
 **/

//斐波那契数列求解
    //第一项 1，第二项 1，第三项 2， 第三项等于前两项之和，计算完 c，让 a 等于c 准备计算下一项
public class Fib {
    public int Fibonacci(int n) {
        int a=1;
        int b = 1;
        int c =0;
        if(n<0)
            return 0;
        if (n ==2 || n == 1)
            return 1;
        for(int i =3; i<=n;i++)
        {
            c = a + b;
            b = a;
            a= c;
        }
        return c;
    }
}
