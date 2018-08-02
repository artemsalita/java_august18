package lab2;

import java.util.Scanner;

/**
 * Created by pro-28 on 02.08.2018.
 */
public class Task8 {

    public static void main(String[] args) {
        Double x;
        Double Rad;

        Scanner s = new Scanner(System.in);
        x = s.nextDouble();

        Rad =  Math.PI / 180;
        x = Math.sin(x * Rad);
        System.out.printf("%.5f", x);
    }
}