package 剑指offer;

/**
 * @program: Experiment
 * @description:给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * @author: Huabuxiu
 * @create: 2019-03-13 08:32
 *
 *指数有正，0，负 三种情况，正数 累乘，超出范围返回-1，负数则先算出分母，然后除1,0就返回1
 **/
public class Power {
    public double Power(double base, int exponent) {
        double temp=1.0;
        if(exponent>0){
            for(int i=1;i <= exponent;i++)
            {
                temp = temp * base;
                if(temp > Double.MAX_VALUE)
                {
                    return -1;
                }
            }
        }
        else if(exponent<0){
            exponent = - exponent;
            for(int i=1;i <= exponent;i++)
            {
                temp = temp * base;
                if(temp > Double.MAX_VALUE)
                {
                    return -1;
                }
            }
            temp = 1.0/temp;
        }else{
            return 1.0;
        }
        return temp;
    }
}
