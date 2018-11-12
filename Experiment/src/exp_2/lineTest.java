package exp_2;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-10-29 15:00
 **/
public class lineTest {
    public static void main(String[] args) {
        Piont p1  = new Piont(1,1);
        Piont p2  = new Piont(4,5);

        Line L = new Line(p1,p2);
        Piont pm = L.Midpoint();
        System.out.println("线段的长度是:"+L.CalculateLength());


        if (L.isHorizontal())
        {
            System.out.println("水平");
        }else
        {
            System.out.printf("不水平");
        }
        if (L.isVertical())
        {
            System.out.println("垂直");
        }else{
            System.out.println("不垂直");
        }

        System.out.println("线段的斜率是:"+L.slope());

        System.out.println("中点是("+pm.getX()+"," +
                +pm.getY()+")");


    }
}
