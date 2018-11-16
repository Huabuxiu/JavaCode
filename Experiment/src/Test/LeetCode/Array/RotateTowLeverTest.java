package LeetCode.Array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateTowLeverTest {

    @Test
    public void rotate() {
        int[][] test = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        String out;
        new RotateTowLever().rotate(test);
        out =arraytoString(test);
        System.out.println(out);
    }
    public static String arraytoString(int[][] nums)
    {
        String ans ="";
        for (int[] num :
                nums) {
            for (int i:
                    num) {
                ans = ans + i+",";
            }
            ans =ans.substring(0,ans.length()-1);
            ans = ans +"\n";
        }
        ans =ans.substring(0,ans.length()-1);
//        ans +="]";
        return ans;
    }
}