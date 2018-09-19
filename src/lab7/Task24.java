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
        int A = num[0];
        int y = 0;

        for (int b = 1;b < num.length;b++){
            if (A>num[b]){

                A=num[b];
                y = b;
            }

        } System.out.println(A);
        System.out.println(y);

    }
}
