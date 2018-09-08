package lab7;

import java.util.Scanner;

/**
 * Created by pro-28 on 30.08.2018.
 */
public class Task6 {

    public static void main(String[] args) {

        String t;
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");

        t = arr[arr.length - 1];
        int u = arr.length - 1;

        int o = arr.length - 2;

        while (u>0) {
            arr[u] = arr[o];
            u--;
            o--;
        }

        arr[0] = t;
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        } 
    }
}
