package exp_6;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class stringcountTest {

    @Test
    public void stringCount() {
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        new stringcount().StringCount(in);
    }

}