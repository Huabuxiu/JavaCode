package exp_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentWeight {
    public static void main(String[] args) {
        List<Double> StuWei = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的体重（负数退出）：");
        double Weight;
        Weight = in.nextDouble();
        while(Weight > 0)
        {
            StuWei.add(Weight);
            Weight = in.nextDouble();
        }
        System.out.println("最大的体重是："+ Collections.max(StuWei));
        System.out.println("最小的体重是："+ Collections.min(StuWei));
        System.out.println( "学生人数是：" + StuWei.size());
    }
}



