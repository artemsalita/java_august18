package lab6;

import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {

        int a = 0;
        int b;

        Scanner s = new Scanner(System.in);
        b = s.nextInt();

        if (b < 0) {
            System.out.println("Значение b должно быть неотрицательным");
        }


        while (a < b) {
            System.out.print("#");
            a++;
            if (a % 20 == 0) {
                System.out.println("#");
            }

        }
    }


}





