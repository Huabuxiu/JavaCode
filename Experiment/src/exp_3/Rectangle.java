package exp_3;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-05 14:33
 **/
public class Rectangle {
    private  int width;
    private int height;

    private  Rectangle rectangle;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public Rectangle() {
        this.height=1;
        this.width = 1;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public boolean equals(Rectangle rectangle) {
        return rectangle.getHeight()==this.height && rectangle.getWidth() ==this.width;
    }

    @Override
    public String toString() {
        return "矩形(" + width +
                "," + height +
                ')';
    }

    public double getArea()
    {
        return height*width;
    }

    public double getPerimeter()
    {
        return 2*(height +width);
    }
}
