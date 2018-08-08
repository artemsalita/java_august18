package lab2;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Double a;
        Double b;
        Double result;
        Double Rad;

        Scanner s = new Scanner(System.in);

        a = s.nextDouble();
        b = s.nextDouble();
        Rad = Math.PI/180;
        result = 3*Math.sin(2*a*Rad)*Math.cos(3*b*Rad);
        System.out.printf("%.4f", result);
    }

}
