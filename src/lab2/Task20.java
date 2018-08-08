package lab2;

import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        double x;
        double y;
        double result;

        Scanner s = new Scanner(System.in);

        x = s.nextDouble();
        y = s.nextDouble();

        if(x+Math.sqrt(y)<0){
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }
        if (y<0){
            System.out.println("Значение y должно быть неотрицательным");
            return;
        }

        result = -5*Math.sqrt(x+(Math.sqrt(y)));
        System.out.printf("%.3f",result);
    }

}
