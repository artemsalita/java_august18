package lab2;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        double temperatureC;
        double temperatureF;

        Scanner s = new Scanner(System.in);
        temperatureC = s.nextDouble();

        if (temperatureC <= -273.16) {
            System.out.println("Температура должна быть выше абсолютного нуля");
            return;
        }

        temperatureF = temperatureC * 1.8 + 32;

        System.out.printf("%.4f", temperatureF);

    }
}
