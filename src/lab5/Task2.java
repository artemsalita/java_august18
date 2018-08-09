package lab5;

import java.util.Scanner;

/**
 * Created by pro-28 on 09.08.2018.
 */
public class Task2 {

    public static void main(String[] args) {
        int P;
        int Q;

        Scanner s = new Scanner(System.in);

        P = s.nextInt();
        Q = s.nextInt();

        if (P > Q) {
            System.out.println("Максимальное " + P + " минимальное " + Q);
        } else if (P < Q) {
            System.out.println("Максимальное " + Q + " минимальное " + P);
        } else {
            System.out.println("Максимальное " + P + " минимальное " + Q);
        }


    }

}


