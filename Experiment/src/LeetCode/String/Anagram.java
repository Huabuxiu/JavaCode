package LeetCode.String;


import java.util.Arrays;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-01-16 19:21
 **/
public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] sa =s.toCharArray();
        char[] ta =t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
       String sat = String.copyValueOf(sa);
       String tat = String.copyValueOf(ta);
       if (sat.equals(tat))
           return true;
       else
           return false;
    }
}
