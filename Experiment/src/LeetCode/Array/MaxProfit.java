package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-14 09:16
 **/
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int sum = 0;
        if (prices.length == 0 ) return 0;
        for (int i =0;i<prices.length-1;i++)
        {
            if (prices[i] < prices[i+1])
            {
                sum +=prices[i+1]-prices[i];
            }
        }
        return sum;

    }
}
