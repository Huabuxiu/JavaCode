package exp_exm;

import java.util.Scanner;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2019-01-04 18:14
 **/
public class numbercheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();

        //检测数字
        for (int i = 0; i< num.length(); i++)
        {
            if (!Character.isDigit(num.charAt(i)));
            {
                System.out.println("No");
                return;
            }
        }

        //检测长度和第一个字符
        if (num.length() == 11 && num.charAt(0) =='1')
        {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
