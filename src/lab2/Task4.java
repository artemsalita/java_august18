package lab2;

import java.util.Scanner;

/**
 * Created by pro-28 on 02.08.2018.
 */
public class Task4 {
    public static void main(String[] args) {
        Integer a;
        int x1;
        int x2;
        int x3;

        Scanner s = new Scanner(System.in);
        x1 = s.nextInt();
        x2 = s.nextInt();
        x3 = s.nextInt();
        a = x1*x2+x1*x3+x2*x3;
        System.out.println(a);
    }
}
