package lab5;

import java.util.Scanner;

/**
 * Created by adm on 17.10.2018.
 */
public class Task13_1 {
    public static void main(String[] args) {
        int X;
        int Y;
        int Z;

        Scanner s = new Scanner(System.in);

        X = s.nextInt();
        Y = s.nextInt();
        Z = s.nextInt();

        if (X != Y && X != Z && Y != Z) {
            System.out.println("Числа не равны друг другу.");
        }
        if (X == Y || X == Z || Y == Z) {
            System.out.println("Среди чисел есть равные.");
        }

    }
}
