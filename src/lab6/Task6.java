package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 14.08.2018.
 */
public class Task6 {
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
       if(A>B){
            while (A>=B){
                System.out.print(B);
                B++;
            }
       }

    }
}