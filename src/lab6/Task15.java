package lab6;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        if (a < b) {
            c = a + 1;
            while (c <= b) {
                //System.out.print(a + " ");
                a = a * c;
                c++;
            }
            System.out.println(a);
            return;
        }

        if (b < a) {
            c = b + 1;
            while (c <= a) {
                //System.out.print(b + " ");
                b = b * c;
                c++;
            }
            System.out.println(b);
            return;
        }


    }
}
