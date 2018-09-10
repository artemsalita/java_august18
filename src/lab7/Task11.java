package lab7;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        int M;
        M = s.nextInt();


        String[] arr = data.split(" ");
        int[] num = new int[arr.length];

        for (int i=0;i<arr.length;i++ ){
            num[i] = Integer.parseInt(arr[i]);

          System.out.print(num[i]*M+" ");
        }

    }
}
