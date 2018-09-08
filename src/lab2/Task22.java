package lab2;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        int aInitial;
        int aRemainder;
        int deg = 360;
        Scanner s = new Scanner(System.in);
        aInitial = s.nextInt();
        aRemainder = aInitial % deg;
        System.out.println(aRemainder);
    }
}
