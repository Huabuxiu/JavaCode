package isPrime;

import java.util.Scanner;
class isPrime {
    public static void main(String[] args) {
        int k;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        System.out.print(2);
        int i, j, tem;
        for (i = 3; i < k; i++) {
            tem = (int) Math.sqrt(i);
            for (j = 2; j <= tem; j++) {

                if (i % j == 0)
                    break;

            }
            if (j > tem) {
                System.out.print(" " + i);
            }
        }
    }
}
