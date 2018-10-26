package Solution;

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) {
        int x;
        int sum =0;
        int temp =0;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        while(x != 0)
        {
            temp = x%10;
            x = x / 10;
            if (sum > Integer.MAX_VALUE/10 || sum == Integer.MAX_VALUE/10 && temp > 7) {sum =0;break;}
            if (sum < Integer.MIN_VALUE/10 || sum == Integer.MIN_VALUE/10 && temp < -8) {sum =0;break;}
            sum = sum * 10+temp;
        }
        System.out.println(sum);
    }


}
