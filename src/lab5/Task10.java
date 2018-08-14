package lab5;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        double X;
        double Y;
        double Z;

        Scanner s = new Scanner(System.in);

        X = s.nextDouble();
        Y = s.nextDouble();
        Z = s.nextDouble();

        if(X>0){
            X = X*X;
        }

        if(Y>0){
            Y = Y*Y;
        }

        if(Z>0){
            Z = Z*Z;
        }
        System.out.println(X+";"+Y+";"+Z);



    }
}
