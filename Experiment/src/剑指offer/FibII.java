package 剑指offer;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-07 12:15
 **/
public class FibII {
    public int JumpFloorII(int target) {


        if(target == 0) {
            return 0;
        }


        //f(n) = f(n-1)+f(n-2)+...+f(1)+1
        //用一个数组来存所有的f(n)
        //f(n) 就只用从 dp[i]一直加到dp[1]
        int[] dp = new int[target + 1];     //申请n+1长度的数组，多出来的位置存1
        dp[0] = 1;  //这个就是最后加的1
        dp[1] = 1;  // 第一个元素

        for(int i = 2;i <= target;i++) {
            dp[i] = 0;
            for(int j = 0;j < i;j++) {
                dp[i] += dp[j];
            }
        }

        return dp[target];
    }
}
