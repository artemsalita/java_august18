package lab6;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


        int A;
        int B;

        Scanner s = new Scanner(System.in);

        A = s.nextInt();
        B = s.nextInt();

        if (A <= B) {
            while (A <= B) {
                System.out.println(A + " " + B);

                A++;
                B = B - 1;

            }
        }

        /*if (A>=B){
            while (A>=B){
                B = B - 1;
            }
        }*/


    }
}



