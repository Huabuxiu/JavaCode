package exp_2.exp2_2;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-29 15:37
 **/
public class fractionTest {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3,4);
        Fraction f2 = new Fraction(5,6);
        Fraction f3 =  f1.Multiplication(f1,f2);
        f3.Display();
    }
}
