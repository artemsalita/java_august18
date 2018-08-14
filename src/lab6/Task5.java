package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 14.08.2018.
 */
public class Task5 {

    public static void main(String[] args) {


        int i;
        int n;
        String a;

        Scanner s = new Scanner(System.in);

        i = 0;

        a = s.nextLine();
        n = s.nextInt();

        System.out.print("\"");
        while (i <= n) {
            System.out.print(a);
            i++;
        }
        System.out.print("\"");


    }
}