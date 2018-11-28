package exp_4;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-19 15:16
 **/
public class Sphere extends Circle{

    public double getArea()
    {
        return 4 * Math.PI *r*r;
    }

    public double getVolume(){
        return 4/3 * Math.PI * r * r * r;
    }
}
