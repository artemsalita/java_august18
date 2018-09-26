package lab7;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();

        String[] dataNum = data.split(" ");
        int[] num = new int[dataNum.length];
        for (int i = 0; i < dataNum.length; i++) {
            num[i] = Integer.parseInt(dataNum[i]);
        }
        int b = 0;
        int A = num[b];
        int y = 0;
        b++;

        for (;b < num.length;b++){
            if (A>num[b]){

                A=num[b];
                y = b;
            }

        } System.out.println(A);
        System.out.println(y);

    }
}
