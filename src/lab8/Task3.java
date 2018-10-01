package lab8;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String b = "abcdefwxyz";
        String CA, CB;
        int m, t, l;
        CA = s.nextLine();
        CB = s.nextLine();

        m = b.indexOf(CA);
        t = b.indexOf(CB);

        if (m < 0) {
            System.out.println("Значение CA отсутствует в строке");
            return;
        }
        if (t < 0) {
            System.out.println("Значение CB отсутствует в строке");
            return;
        }
        /*if (m==t)*/
        else {
            System.out.println("0");
        }

        if (m < t) {
            l = t - m - 1;
            System.out.println(l);

        }
        if (m > t) {
            l = m - t - 1;
            System.out.println(l);
        }


    }
}
