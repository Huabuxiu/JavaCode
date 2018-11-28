package exp_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SphereTest {

    @Test
    public void getArea() {
        double res;
        Sphere sphere = new Sphere();
        sphere.setR(3.0);
        res = sphere.getArea();
        System.out.println(res);
    }

    @Test
    public void getVolume() {
        double res;
        Sphere sphere = new Sphere();
        sphere.setR(3.0);
        res = sphere.getVolume();
        System.out.println(res);
    }
}