package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 14.08.2018.
 */
public class Task3 {

    public static void main(String[] args) {
        int i;
       int n;
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        n = s.nextInt();
        while (i <= n) {
            System.out.println(i + " ");
            i++;
        }
    }
}