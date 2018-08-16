package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 16.08.2018.
 */
public class Task18_2 {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int  a;
        int count = 0;
        int sum = 0;


        do {
            a = s.nextInt();
            sum = sum + a;
            count++;
        }while (a !=0);
        System.out.println(sum+" "+count);


    }
}
