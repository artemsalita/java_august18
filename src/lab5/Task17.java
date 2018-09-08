package lab5;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {
        int X, Y, Z, A, B;
        Scanner s = new Scanner(System.in);
        X = s.nextInt();
        Y = s.nextInt();
        Z = s.nextInt();
        A = Math.max(X, Y);
        B = Math.max(A, Z);
        System.out.println(B);
    }
}