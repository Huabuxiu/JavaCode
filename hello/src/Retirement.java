import java.util.Scanner;

public class Retirement {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("how much moneyssjkdsjkd");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %:");
        double interstRate = in.nextDouble();

        double balance = 0;
        int year =0;

        String input;
        do {
            balance += payment;
            double interest = balance *interstRate/100;

            balance += interest;
            year++;

            System.out.printf("After year %d ,your balance is %,.2f%n",year,balance);
            System.out.print("Ready to retire? (Y/N) ");
            input = in.next();

        }while(input.equals("N"));
    }
}
