package lab5;

import java.util.Scanner;

/**
 * Created by pro-28 on 09.08.2018.
 */
public class Task1 {

    public static void main(String[] args) {
        int a;
        int b;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        if (a > b) {
            System.out.println("Первое");
        } else if (a < b) {
            System.out.println("Второе");
        } else {
            System.out.println("Равны");
        }


    }

}


