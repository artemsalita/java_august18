package lab2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Integer a;
        Integer b;

        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        b = 12 * a * a + 7 * a - 16;
        System.out.println(b);

    }
}