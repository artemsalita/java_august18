package lab6;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int A;
        int B;
        Scanner s = new Scanner(System.in);

        A = s.nextInt();
        B = s.nextInt();

        if (A < B) {
            while (A <= B) {
                System.out.print(B);
                B = B - 1;
            }
        } else {
            System.out.println("Значение A должно быть не больше значения B");
        }


    }

}
