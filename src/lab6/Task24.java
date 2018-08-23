package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 22.08.2018.
 */
public class Task24 {

    public static void main(String[] args) {

        int a ;
        int n=0;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        while (n<a){
            System.out.print("!");
            n++;
            if (n%5==0) {
                System.out.print(" ");
            }
            }
       // System.out.println(n);
        }


    }


