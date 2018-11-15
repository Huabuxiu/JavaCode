package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-14 17:22
 **/
public class Rotate {
    public void rotate(int[] nums, int k) {
        if(nums.length==0 || nums.length == 0 || k % nums.length == 0)
            return;

        int turns = k %nums.length;
        int middle = nums.length - turns;

        reverse(nums,0,middle-1);
        reverse(nums,middle,nums.length-1);
        reverse(nums,0,nums.length-1);
    }

    public void reverse(int[] nums,int s,int e){
        while (s<e)
        {
            nums[s] +=nums[e];
            nums[e] = nums[s]-nums[e];
            nums[s] = nums[s] -nums[e];
            s++;
            e--;
        }
    }

}
