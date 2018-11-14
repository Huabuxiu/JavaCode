package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-14 09:03
 **/
public class RemoveDuplicatesSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 ) return 0;
        int i = 0;
        for (int j=1; j < nums.length ; j++)
        {
            if (nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
            }
        }
    return i+1;
    }
}