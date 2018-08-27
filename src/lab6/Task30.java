package lab6;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {


        int X;
        int a = 0;

        Scanner s = new Scanner(System.in);
        X = s.nextInt();

        if (X <= 0) {
            System.out.println("Значение X должно быть положительным");
            return;
        }

        while (a < X) {
            a++;
            if (X % a == 0) {
                System.out.print(a + " ");
            }

        }
    }

}
