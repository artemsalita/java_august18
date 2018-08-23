package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 22.08.2018.
 */
public class Task27 {

    public static void main(String[] args) {

        int a = 0;
        int b = 15;

        int x;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();

        while (a < x) {
            System.out.print("#");
            a++;
        }
        while (x < b) {
            System.out.print(".");
            x++;
        }

    }
}