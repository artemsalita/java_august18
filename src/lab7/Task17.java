package lab7;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String X;
        X = s.nextLine();

        String[] a;
        a = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]);

            if (a[i].equals(X)) {
                System.out.println();
                return;
            }



        }
    }
}