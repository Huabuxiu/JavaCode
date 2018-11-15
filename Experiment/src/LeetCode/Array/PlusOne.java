package LeetCode.Array;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-11-15 10:33
 **/
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int temp = digits[digits.length-1];
        int carry,i;
        for (i=digits.length-1;i >0; i--)
        {
            carry= Carry(digits[i]);
            if (carry == 0)
                break;
            digits[i]  = 0;
        }
        if (Carry(digits[i])==1)        //还要进位
        {
            digits[i] = 0;
            int[] ans = new int[digits.length+1];
            ans[0] = 1;
            return ans;
        }
        else
            digits[i] +=1;
        return digits;
    }

    public int Carry(int plus)
    {
        if (plus == 9)
            return 1;
        else
        {
            return 0;
        }
    }
}
