package Equation;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入方程的A,B,C参数");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double d = Math.sqrt(b*b - 4 * a * c );
        if (d > 0)
        {
            System.out.println("结果为:\nX1="+(-b+d)/2*a);
            System.out.println("X2="+(-b-d)/2*a);
        }else if (d == 0)
        {
            System.out.println("结果为："+(-b/2*a));
        }else
        {
            System.out.println("结果不存在");
        }
    }
}
