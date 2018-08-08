package lab2;

import java.util.Scanner;

public class Task17 {

    public static void main(String[] args) {

        double x;
        double result;

        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        if(x<=0){
            System.out.println("Значение X должно быть неотрицательным");
            return;
        }

        result = Math.sqrt(x);
        System.out.printf("%.5f",result);


    }

}
