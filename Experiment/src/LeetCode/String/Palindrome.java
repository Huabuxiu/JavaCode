package LeetCode.String;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-03-04 10:52
 **/
public class Palindrome {
    public boolean isPalindrome(String s) {
        if(s ==null) return true;
        s=s.toLowerCase();
        int left=0,right=s.length()-1;
        while (left < right)
        {
            if (!isNum(s.charAt(left))) ++left;
            else if (!isNum(s.charAt(right))) --right;
            else if (!(s.charAt(left)==s.charAt(right))) return false;
            else
            {
                left++;
                right--;
            }
        }

        return true;
    }

    public boolean isNum(char ch){
        if (ch >= 'a' && ch <= 'z') return true;
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }
}
