package exp_6;

import org.junit.Test;

import static org.junit.Assert.*;

public class addArrayTest {

    @Test
    public void merge() {
        int[] a = {1,7,9,11,13,15,17,19};
        int[] b = {2,4,6,8,10};
        addArray test = new addArray();
        int[] s =  test.merge(a,b);
        for (int ele :
                s) {
            System.out.printf("%d ",ele);
        }
    }
}