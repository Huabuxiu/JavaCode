package exp_2;

/**
 * @program: Experiment
 * @description: this is a Point
 * @author: Huabuxiu
 * @create: 2018-10-29 14:40
 **/
public class Piont {

    private double x;
    private double y;

    public Piont() {
    }

    public Piont(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public double CalculatDistance(){
        /**
        * @Description: 计算到原点的距离
        * @Param: []
        * @return: double
        * @Author: Huabuxiu
        * @Date: 2018/10/29
        */
        return Math.sqrt(x*x + y*y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
}
