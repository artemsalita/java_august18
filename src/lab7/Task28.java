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

        int D = 0;
        int B = 1;
        int A = num[D];
        int y = D;
        int z;

        for (;D<num.length;){

            A = num[D];

            y = D;

            for (int b = B; b < num.length; b++) {
                if (A > num[b]) {

                    A = num[b];
                    y = b;
                }
            }
        z = num[y];
        num[y] = num[D];
        num[D] = z;
        for (int w = 0; w < num.length; w++) {
            System.out.print(num[w]);
        }

        System.out.println();
            D++;

        B++;

    }

        /* A = num[D];
         y = D;


        for (int b = B;b < num.length;b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }
        z = num[y];
        num[y] = num [D];
        num[D] = z;
        for (int w = 0;w<num.length;w++){
            System.out.print(num[w]);

        }
        System.out.println();

        D++;
        B++;

        A = num[D];
        y = D;


        for (int b = B;b < num.length;b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }
        z = num[y];
        num[y] = num [D];
        num[D] = z;
        for (int w = 0;w<num.length;w++){
            System.out.print(num[w]);

        }
        System.out.println();

        D++;
        B++;

        A = num[D];
        y = D;


        for (int b = B;b < num.length;b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }
        z = num[y];
        num[y] = num [D];
        num[D] = z;
        for (int w = 0;w<num.length;w++){
            System.out.print(num[w]);

        }        System.out.println();

        D++;
        B++;

        A = num[D];
        y = D;


        for (int b = B;b < num.length;b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }
        z = num[y];
        num[y] = num [D];
        num[D] = z;
        for (int w = 0;w<num.length;w++){
            System.out.print(num[w]);

        }*/

    }
}
