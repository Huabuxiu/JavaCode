package exp_6;

import java.util.Scanner;

/**
 * @program: Experiment
 * @description:
 * @author: Huabuxiu
 * @create: 2018-12-12 09:33
 **/
public class stringcount {


    public void StringCount(String sb)
    {
        int a = 0, b = 0, c = 0;
        for (int j = 0; j < sb.length(); j++) {
                //48——57代表0——9
            if (sb.charAt(j) <= 57 & sb.charAt(j) >= 48) {
                a++;
            }
                //65——90代表A-Z,97-122代表a——z
            if (sb.charAt(j) <= 90 & sb.charAt(j) >= 65 | sb.charAt(j) <= 122
                    & sb.charAt(j) >= 97) {
                b++;
            }
            if (sb.charAt(j) == ' ') {
                c++;
            }
        }
        System.out.println("数字个数:" + a);
        System.out.println("字母数:" + b);
        System.out.println("空格数:" + c);
        System.out.println("其他字符数：" + (sb.length() - a - b - c));
    }
}
