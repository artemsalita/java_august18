package lab2;

import java.util.Scanner;

public class Task18 {

    public static void main(String[] args) {

        double x;
        double result;

        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        if(x>=62){
            System.out.println("Подкоренное выражение должно быть неотрицательным");
            return;
        }

        result = 3* Math.sqrt(61-x) ;
        System.out.printf("%.5f",result);

    }

}
