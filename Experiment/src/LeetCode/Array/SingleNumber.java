package LeetCode.Array;

import java.util.HashSet;
import java.util.Set;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-15 08:50
 **/
public class SingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for (int i :
                nums) {
            if (!set.contains(i)) set.add(i);
            else set.remove(i);
        }
        return   set.iterator().next();
    }
}
