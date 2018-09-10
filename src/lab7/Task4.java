package lab7;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        String[] arr = data.split(" ");

        for (n = arr.length - 1; n >= 0; n--) {
            System.out.print(arr[n]+" ");
        }

    }

}
