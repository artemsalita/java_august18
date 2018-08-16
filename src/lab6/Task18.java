package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 16.08.2018.
 */
public class Task18 {

    public static void main(String[] args) {

        Scanner s =new Scanner(System.in);

        int a;
        int count;
        a = s.nextInt();
        int sum;
        sum = 0;
        count = 1;

        sum = sum + a;
        if (a !=0) {
            while (a!=0){
                a = s.nextInt();
                sum = sum + a;
                count++;
            }

        }
        System.out.println("Сумма "+sum+" количество "+count);

    }

}
