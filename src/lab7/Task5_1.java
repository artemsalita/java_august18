package lab7;

import java.util.Scanner;

public class Task5_1 {

    public static void main(String[] args) {
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

//if ()
        if (B<=E) {
            for (; B <= E; B++) {
                System.out.print(arr[B] + " ");
            }
        }else {
            for (; E <= B; E++) {
                System.out.print(arr[E] + " ");
            }
        }

    }
}
