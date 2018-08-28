package lab6;

import java.util.Scanner;

public class Task31 {

    public static void main(String[] args) {


        int Y;
        int a = 1;

        Scanner s = new Scanner(System.in);
        Y = s.nextInt();

        int y = Y-1;

        if (Y <= 0) {
            System.out.println("Значение Y должно быть положительным");
            return;
        }

        while (a<=y){

            a++;



            if (y%a == 0){

                System.out.println("число не простое");
                return;
            }


            if (y%a !=0){

                System.out.println("число простое");
                return;
            }




        }





    }

}


