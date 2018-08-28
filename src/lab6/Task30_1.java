package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 28.08.2018.
 */
public class Task30_1 {

    public static void main(String[] args) {

        int X;

        Scanner s = new Scanner(System.in);
        X = s.nextInt();

        if (X <= 0) {
            System.out.println("Значение X должно быть положительным");
            return;
        }

        for (int a = 1; a<=X; a++) {
            if (X % a == 0) {
                System.out.print(a + " ");
            }
        }
    }

}
