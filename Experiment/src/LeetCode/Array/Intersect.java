package LeetCode.Array;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-15 09:02
 **/
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i :
                nums1) {
            set.add(i);
        }
        for (int i :
                nums2) {
            if (set.contains(i) && !list.contains(i))
                list.add(i);
        }
        int[] ans = new int[list.size()];
        for (int j=0;j<list.size();j++)
            ans[j] = list.get(j);
        return ans;
    }
    public int[] intersect1(int[] nums1, int[] nums2)
    {
        List<Integer> tmp = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums1.length; i++) {
            Integer value = map.get(nums1[i]);
            map.put(nums1[i], (value == null ? 0 : value) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) != 0) {
                tmp.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        int[] result = new int[tmp.size()];
        int i = 0;
        for (Integer e : tmp)
            result[i++] = e;
        return result;
    }
}
