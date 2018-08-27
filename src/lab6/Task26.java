package lab6;

import java.util.Scanner;

public class Task26 {

    public static void main(String[] args) {

        int a = 30;
        int b = 40;
        int c;

        Scanner s = new Scanner(System.in);
        c = s.nextInt();

        while (a <= b) {
            if (a == c) {
                System.out.println(a + "+");
               // a++;
                }

            System.out.println(a + "-");
            a++;


        }

    }
}