package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-04 10:28
 **/
public class moveZero {
    public void moveZeroes(int[] nums) {
        int piont=0;
        for (int num:
             nums) {
            if (num !=0)
            {
                nums[piont++] = num;
            }
        }
        while (piont <nums.length)
        {
            nums[piont++] = 0;
        }

    }
}
