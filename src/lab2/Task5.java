package lab2;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Integer x;
        Integer y;

        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        y = (7*x*x)-(3*x)+6;
        System.out.println(y);
    }

}
