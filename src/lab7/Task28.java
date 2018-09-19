package lab7;

import java.util.Scanner;

public class Task28 {
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
        int z;

        for (int b = 1;b < num.length;b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }
            z = num[y];
            num[y] = num [0];
            num[0] = z;
        for (int w = 0;w<num.length;w++){
            System.out.print(num[w]);

        }
        System.out.println();

         A = num[1];
         y = 1;


        for (int b = 2;b < num.length;b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }
        z = num[y];
        num[y] = num [1];
        num[1] = z;
        for (int w = 0;w<num.length;w++){
            System.out.print(num[w]);

        }

    }
}
