package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-14 09:20
 **/
public class ArrayMain {
    public static void main(String[] args) {
        int[] test = {1,2};
        String out =arraytoString(test);
        new Rotate().rotate(test,3);
        out =arraytoString(test);
        System.out.println(out);
    }


    public static String arraytoString(int[] nums)
    {
        String ans = "[";
        for (int i :
                nums) {
            ans = ans + i+",";
        }
        ans =ans.substring(0,ans.length()-1);
        ans +="]";
        return ans;
    }
}
