package lab7;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String X;
        X = s.nextLine();

        String[] a;
        a = new String[]{"11", "13", "17", "19", "10", "12", "14", "15", "16", "18", "20"};

        for (int i = 0; i < a.length; i++) {

            if (a[i].equals(X)) {
                System.out.println(a[i] + "+");
            } else System.out.println(a[i]);


        }
    }
}
