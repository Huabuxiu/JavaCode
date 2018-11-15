package LeetCode.Array;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-15 08:26
 **/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0) return false ;
        Set<Integer> set = new HashSet<>();
        for (int i :
                nums) {
            if (!set.contains(i)) {
                set.add(i);
            }else
                return true;
        }
        return false;
    }
}
