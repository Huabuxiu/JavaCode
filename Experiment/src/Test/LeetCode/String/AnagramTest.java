package LeetCode.String;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void isAnagram() {
//Input: s = "anagram", t = "nagaram"
//Output: true

        String s = "rat";
        String t = "crt";
        if (new Anagram().isAnagram(s,t))
            System.out.println("true");
        else
            System.out.println("false");
    }
}