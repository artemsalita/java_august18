package lab2;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        double aDeg, mass, result, aRad, g = 9.8067;
        Scanner s = new Scanner(System.in);
        mass = s.nextDouble();
        aDeg = s.nextDouble();
        if (mass <= 0) {
            System.out.print("Масса должна быть положительной");
            return;
        }
        aRad = aDeg * Math.PI / 180;
        result = mass * g * Math.cos(aRad);
        System.out.printf("%.6f", result);
    }
}
