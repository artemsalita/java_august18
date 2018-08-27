package lab6;

import java.util.Scanner;

public class Task20 {


    public static void main(String[] args) {

        int a;
        int count = 1;
       // int sum = 0;

        Scanner s =new Scanner(System.in);
        a = s.nextInt();

       // sum = sum + a;
        if (a !=0) {
            while (a!=0){
                a = s.nextInt();
               // sum = sum + a;
                count++;
            }

        }
        System.out.println(" количество "+count);



    }

}
