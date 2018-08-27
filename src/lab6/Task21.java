package lab6;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {

        int a;
        int b;
        int sum = 0;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        if (a<b){
            while (a<=b){
                sum = sum + (a*a);
                a++;


            }
        }

        if (a>b){
            while (a>=b){
                sum = sum + (b*b);
                b++;


            }
        }


        System.out.println(sum);




    }

}
