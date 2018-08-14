package lab5;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        int A;
        int B;
        int C;

        Scanner s = new Scanner(System.in);

        A = s.nextInt();
        B = s.nextInt();
        C = s.nextInt();

        if (A < 0) {
            System.out.println("Значение A должно быть неотрицательным");
            return;
        }
        if (B < 0) {
            System.out.println("Значение B должно быть неотрицательным");
            return;
        }
        if (C < 0) {
            System.out.println("Значение C должно быть неотрицательным");
            return;
        }

        if (A == B) {
            System.out.println("Треугольник является равнобедренным.");
            return;
        }
        if (A == C) {
            System.out.println("Треугольник является равнобедренным.");
            return;
        }
        if (B == C) {
            System.out.println("Треугольник является равнобедренным.");
            return;
        }

        if (A == B && B == C) {
            System.out.println("Треугольник является равнобедренным.");
            return;
        } else {
            System.out.println("Треугольник не является равнобедренным.");
            return;
        }

    }

}
