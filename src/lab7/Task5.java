package lab7;

import java.util.Scanner;

/**
 * Created by pro-28 on 30.08.2018.
 */
public class Task5 {

    public static void main(String[] args) {

        int B;
        int E;
        String t;
       // int n=0;
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        B = s.nextInt();
        E = s.nextInt();
        String[] arr = data.split(" ");

        if (B > arr.length || B < 0) {
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        }
        if (E > arr.length || E < 0) {
            System.out.println("Число E должно быть в интервале [0, размер массива)");
            return;
        }

            t = arr[B];
        arr[B] = arr[E];
        arr[E] = t;

        for (int n=0;n<arr.length;n++){
            System.out.print(arr[n]+" ");
        }




    }

}
