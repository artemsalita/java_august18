package lab6;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        int A;
        int B;
        Scanner s = new Scanner(System.in);

        A = s.nextInt();
        B = s.nextInt();

        if(A<B) {
            while (A <= B) {
                System.out.print(A);
                A++;

            }
        }

        else {
            while (A >= B) {
                System.out.print(A);
                A = A -1;
            }
        }

    }

}
