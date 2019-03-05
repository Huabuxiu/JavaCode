package LeetCode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void isPalindrome() {

        Palindrome palindrome = new Palindrome();
        String s = "A man, s nam,a";
        if (palindrome.isPalindrome(s))
        {
            System.out.println("成功");
        }
    }
}