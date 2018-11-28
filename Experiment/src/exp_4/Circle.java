package exp_4;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-19 15:10
 **/
public class Circle {
     protected Double r;

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public double getarea()
     {
        return Math.PI * r * r;
     }
     public double getPerimeter()
     {
         return 2 * Math.PI *r;
     }

}
