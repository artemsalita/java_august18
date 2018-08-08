package lab2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Double a;
        Double b;
        Double result;
        Double Rad;

        Scanner s = new Scanner(System.in);

        a = s.nextDouble();
        b = s.nextDouble();
        Rad = Math.PI/180;
        result = Math.sin(a*Rad)*Math.cos(b*Rad)+Math.cos(a*Rad)*Math.sin(b*Rad);
        System.out.printf("%.4f", result);
    }
}
