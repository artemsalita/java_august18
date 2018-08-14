package lab5;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int X;
        int Y;
        int Z;

        Scanner s = new Scanner(System.in);

        X = s.nextInt();
        Y = s.nextInt();
        Z = s.nextInt();

        if(X==Y){

            System.out.println("Среди чисел есть равные.");

            }
         if(X==Z) {

             System.out.println("Среди чисел есть равные.");
         }
         if(Y==Z) {
             System.out.println("Среди чисел есть равные.");
             return;
         }
         else{

             System.out.println("Числа не равны друг другу.");

         }



    }

}
