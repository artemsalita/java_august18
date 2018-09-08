package lab2;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        double R1;
        double R2;
        double result;
        Scanner s = new Scanner(System.in);
        R1 = s.nextDouble();
        R2 = s.nextDouble();
        if (R1 == 0) {
            System.out.println("Значение R1 должно быть не равно нулю");
            return;
        }
        if (R2 == 0) {
            System.out.println("Значение R2 должно быть не равно нулю");
            return;
        }
        result = (1 / R1) + (1 / R2);
        System.out.printf("%.4f", result);
    }
}
