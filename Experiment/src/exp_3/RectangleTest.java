package exp_3;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-05 14:41
 **/
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3,4);
        System.out.println(
                "长："+rectangle1.getHeight()
        );
        System.out.println("宽"+rectangle1.getWidth());
        System.out.println("面积"+rectangle1.getArea());
        System.out.println("周长"+rectangle1.getPerimeter());
        rectangle1.toString();
        if (rectangle1.equals(new Rectangle(4,5)))
        {
            System.out.printf("相等");
        }else {
            System.out.println("不相等");
        }
    }
}
