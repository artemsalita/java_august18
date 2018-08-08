package lab2;

import java.util.Scanner;

public class Task16 {

    public static void main(String[] args) {

        int radius;
        int radius3 = 3;
        double volume;

        Scanner s = new Scanner(System.in);
        radius = s.nextInt();
        if (radius<=0 ) {
            System.out.println("Значение radius должно быть положительным");
            return;
        }

        volume = 4* Math.PI * (Math.pow(radius,radius3))/3;
        System.out.println(volume);

    }

}
