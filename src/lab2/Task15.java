package lab2;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        int radius;
        double circumference;

        Scanner s = new Scanner(System.in);
        radius = s.nextInt();

        if (radius <=0 ){
            System.out.println("Радиус должен быть положительным");
            return;
        }

        circumference = Math.PI*2*radius;
        System.out.println(circumference);
    }

}
