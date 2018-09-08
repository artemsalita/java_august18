package lab2;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        double discriminant,a,b,c;
        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        discriminant = (b*b)-(4*a*c);
        System.out.printf("%.4f",discriminant);

    }
}
