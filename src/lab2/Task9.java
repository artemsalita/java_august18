package lab2;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Double y;
        Double Deg;

        Scanner s = new Scanner(System.in);
        y = s.nextDouble();

        Deg =  Math.PI / 180;
        y =5* Math.cos(y * Deg);
        System.out.printf("%.4f", y);

    }

}
