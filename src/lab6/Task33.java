package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 28.08.2018.
 */
public class Task33 {

    public static void main(String[] args) {

        int x;
        int y = 1;
        int i = 0;
        //String "1","2","3",d,e,f,g,h;
        Scanner s = new Scanner(System.in);
        x= s.nextInt();

        if (x<1||x>20){
            System.out.println("Значение x должно быть в интервале [0, 20]");
            return;
        }

       // for (y)

        while (i<=9) {

            while (y <= x) {
                System.out.print(i);
                y++;

            }
            System.out.println();

            y = 1;
            i++;
        }



        /*while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
        System.out.println();

        y=1;
        i++;
        while (y<=x){
            System.out.print(i);
            y++;

        }
       // System.out.println();

       // y=1;





       /* while (y<=x){
            System.out.print("2");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("3");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("4");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("5");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("6");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("7");
            y++;
        }
        System.out.println();
        y=1;
        while (y<=x){
            System.out.print("8");
            y++;
        }*/
    }
}
