package LeetCode.String;

import java.util.*;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-28 11:12
 **/
public class FirstUniqChar {

    public int firstUniqChar(String s) {
            /**
            * @Description: 做出数组存每个字母第一次出现的下标和次数，返回第一个次数为1的下标
            * @Param: [s]
            * @return: int
            * @Author: Huabuxiu
            * @Date: 2018/11/28
             * map存字母的对应的下标，数组存
            */
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] schar = s.toCharArray() ;
        for (int i=0; i < schar.length;i++) {
            if (!map.containsKey(schar[i])){   //没找到，直接加
                map.put(schar[i],i);
            }else {
                map.put(schar[i],-1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if (value != -1) {
                return value;
            }
        }
        return -1;
    }
}
