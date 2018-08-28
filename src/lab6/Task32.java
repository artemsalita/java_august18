package lab6;

import java.util.Scanner;

public class Task32 {

    public static void main(String[] args) {
        int x;
        int y = 1;
        String a,b,c,d,e,f,g,h;
        Scanner s = new Scanner(System.in);
        x= s.nextInt();

        if (x<1||x>20){
            System.out.println("Значение x должно быть в интервале [0, 20]");
            return;
        }

        while (y<=x){
            System.out.print("a");
            y++;
        }
        System.out.println();
        y=1;

        while (y<=x){
            System.out.print("b");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("c");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("d");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("e");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("f");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("g");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("h");
            y++;
        }
        /*System.out.println();
        y=1;*/


        /*while (y<x){
            System.out.println("a");
            System.out.println("b");
            System.out.println("c");
           y++;
        }*/


        /*while (y<=x){
            System.out.println("a"+"b"+"c");
            y++;
        }*/

        /*while (y<x){
            System.out.print("a");
            System.out.print("b");
            System.out.print("c\n");
            y++;
        }*/


    }

}
