package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 22.08.2018.
 */
public class Task23 {
    public static void main(String[] args) {
        int a ;
        int c = 0;
        int b = 0;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while (c<=a) {
            System.out.println(c+ " - "+ b);
            b++;
            c++;
            if (b>=4){
                b = 0;
            }

        }
    }
}
