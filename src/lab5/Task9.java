package lab5;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        int areaCircle;
        int areaSquare;

        Scanner s = new Scanner(System.in);

        areaCircle = s.nextInt();
        areaSquare = s.nextInt();

        if(areaCircle<0){
            System.out.println("Площадь круга должна быть положительной");
            return;
        }
        if(areaSquare<0){
            System.out.println("Площадь квадрата должна быть положительной");
            return;
        }

        if(areaCircle>areaSquare){
            System.out.println("Круг не поместится в квадрате");
            }
         if(areaCircle<areaSquare){
             System.out.println("Круг уместится в квадрате");
         }

    }

}
