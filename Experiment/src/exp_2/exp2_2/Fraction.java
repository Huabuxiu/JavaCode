package exp_2.exp2_2;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-29 15:28
 **/
public class Fraction {
    private double Denominator; //分母
    private double Dumerator; //分子

    public Fraction(double denominator, double dumerator) {
        Denominator = denominator;
        Dumerator = dumerator;
    }

    public Fraction() {
    }

    public double getDenominator() {
        return Denominator;
    }

    public void setDenominator(double denominator) {
        Denominator = denominator;
    }

    public double getDumerator() {
        return Dumerator;
    }

    public void setDumerator(double dumerator) {
        Dumerator = dumerator;
    }

    public Fraction Multiplication(Fraction f1, Fraction f2){
        Fraction Ans = new Fraction();
        /**
        * @Description: 计算分数乘法
        * @Param: [f1, f2]
        * @return: exp_2.exp2_2.Fraction
        * @Author: Huabuxiu
        * @Date: 2018/10/29
        */

        Ans.setDenominator(f1.getDenominator()*f2.getDenominator()); //分母
        Ans.setDumerator(f1.getDumerator()*f2.getDumerator());      //分子
        return Ans;
    }

    public void Display()
    {
        /** 
        * @Description: 输出分数 
        * @Param: [] 
        * @return: void 
        * @Author: Huabuxiu 
        * @Date: 2018/10/29 
        */ 

        //化简分数
        int s=1;
        for(int i=2;i<=(int)Denominator&&i<=(int)Dumerator;i++)
        {
            if((int)Denominator%i==0&&(int)Dumerator%i==0)
            {
                s=i;
            }
        }

        Dumerator /=s ;
        Denominator /= s;
//按照格式输出
        System.out.printf((int)Denominator +"/"+(int)Dumerator);
    }
}
