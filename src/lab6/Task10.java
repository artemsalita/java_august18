package lab6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        int A;
        int B;
        int C;
        Scanner s = new Scanner(System.in);
        A = s.nextInt();
        B = s.nextInt();
        C = B;
        if (A <= B) {
            while (A <= B) {
                System.out.println(A + " " + C);
                A++;
                C = C - 1;
                //B = B - 1;
            }
            //return;

        } else {
            // if (A >= B) {
            while (A >= B) {
                System.out.println(A + " " + C);
                C++;
                A = A - 1;
            }
            //}
        }
    }
}

