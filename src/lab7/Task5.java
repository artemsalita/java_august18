package lab7;

import java.util.Scanner;

public class
Task5 {
    public static void main(String[] args) {
        // int n;
        int B;
        int E;
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
        if (B <= E) {
            while (B <= E) {
                System.out.print(arr[B] + " ");
                B++;
            }
           // return;
        }

        /*if (E <= B)*/
        else {
            while (E <= B) {
                System.out.print(arr[E] + " ");
                E++;
            }
           // return;
        }

        /*for (int B;B<=E;B++){
           System.out.print(arr[B]+" ");
       } */

    }
}


