package lab6;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;
        int b = 500;
        int c;
        a = s.nextInt();
        c = a + 1;

        if (a<-101){
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }

        if (a>501){
            System.out.println("Значение A должно быть в интервале [-100, 500]");
            return;
        }

        while (c <= b) {
            System.out.print(a+" ");
            a = a + c;
            c ++;

        }
        System.out.println(a);


    }


}
