package lab5;

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {


        int radius;
        int edge;
        double radiusS;
        double edgeS;

        Scanner s = new Scanner(System.in);

        radius = s.nextInt();
        edge = s.nextInt();

        radiusS = Math.PI * radius * radius;
        edgeS = edge * edge;

        if (radius < 0) {
            System.out.println("Радиус должен быть положительным");
            return;
        }
        if (edge < 0) {
            System.out.println("Сторона квадрата должна быть положительна");
            return;
        }
        if (edgeS>radiusS){
            System.out.println("Площадь квадрата "+edgeS+" больше площади круга "+/*"%.4f",*/radiusS);
        }
        if (radiusS>edgeS){
            System.out.println("Площадь круга "+radiusS+" больше площади квадрата "+edgeS+"");
        }


    }

}
