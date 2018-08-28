package lab7;

import java.util.Scanner;

/**
 * Created by pro-28 on 28.08.2018.
 */
public class Task2 {

    public static void main(String[] args) {

        //int A;
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();//принимает все что в сторке в массив
        //A = s.nextInt();

        int n = 0;

        String[] arr = data.split(" ");

        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        while (n < arr.length) {
            System.out.println(arr[n] + " " + n);
            n++;


        }

    }

}
