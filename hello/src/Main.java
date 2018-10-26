import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("what is your name?");
        String name = in.nextLine();
        System.out.print("How old are you?");
        int age= in.nextInt();
        System.out.println("hello "+name + "next year ,you will "+(age+1));
    }
}
