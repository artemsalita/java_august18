package lab2;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {


        double a;
        double b;
        double result;

        Scanner s = new Scanner(System.in);
        a = s.nextDouble();
        b = s.nextDouble();


        if(b>0){
            System.out.println("Значение b должно быть не положительным");
            return;
        }
        result = a*Math.sqrt(b*(-7));
        System.out.printf("%.4f",result);

    }

}
