package lab5;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {


        int X;
        int Y;
        int Z;

        Scanner s = new Scanner(System.in);

        X = s.nextInt();
        Y = s.nextInt();
        Z = s.nextInt();

      /*  if(-3.5<X&&X<5){
            System.out.println(X);
        }
        if(-3.5<Y&&Y<5){
            System.out.println(Y);
        }
        if(-3.5<Z&&Z<5){
            System.out.println(Z);
        } */

        if(-3.5<X&&X<5||-3.5<Y&&Y<5||-3.5<Z&&Z<5){
            System.out.println(X+" "+Y+" "+Z);
        }


    }

}
