package exp_2;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-29 14:44
 **/
public class Line {
    private Piont p1;
    private Piont p2;

    public Line() {
    }

    public Line(Piont p1, Piont p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double CalculateLength()
    {
        /**
        * @Description: 计算线段长度
        * @Param: []
        * @return: double
        * @Author: Huabuxiu
        * @Date: 2018/10/29
        */
        double Length;
        Length = Math.sqrt((p1.getX()-p2.getX()) * (p1.getX()-p2.getX()) +
                (p1.getY()-p2.getY()) * (p1.getY()-p2.getY()));
        return Length;
    }

    public boolean isHorizontal()
    {
            /**
            * @Description: 判断是否水平
            * @Param: []
            * @return: boolean
            * @Author: Huabuxiu
            * @Date: 2018/10/29
            */

        return p1.getY() == p2.getY();
    }

    public boolean isVertical()
    {
        /**
        * @Description: 判断垂直
        * @Param: []
        * @return: boolean
        * @Author: Huabuxiu
        * @Date: 2018/10/29
        */
        return p1.getX() == p2.getX();
    }

    public double slope()
    {
        /**
        * @Description: 计算斜率
        * @Param: []
        * @return: double
        * @Author: Huabuxiu
        * @Date: 2018/10/29
        */
        return (p2.getY()-p1.getY())/(p2.getX()-p1.getX());
    }

    public Piont Midpoint()
    {
        /**
        * @Description:求线段中点
        * @Param: []
        * @return: exp_2.Piont
        * @Author: Huabuxiu
        * @Date: 2018/10/29
        */
        Piont P = new Piont();
        P.setX( (p1.getX()+p2.getX())/2.0);
        P.setY( (p1.getY()+p2.getY())/2.0);
        return P;
    }


}
