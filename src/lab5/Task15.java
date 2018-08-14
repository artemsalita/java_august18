package lab5;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {

        double X;
        double Y;
        double Z;

        Scanner s = new Scanner(System.in);

        X = s.nextInt();
        Y = s.nextInt();
        Z = s.nextInt();

        if(-3.5<X&&X<5){
            System.out.print(X+" ");
        }
        if(-3.5<Y&&Y<5){
            System.out.print(Y+" ");
        }
        if(-3.5<Z&&Z<5){
            System.out.print(Z+" ");
        }

       /* if(-3.5<X&&X<5||-3.5<Y&&Y<5||-3.5<Z&&Z<5){
            System.out.println(X+" "+Y+" "+Z);
        }*/


    }

}
