package lab7;

import java.util.Scanner;

public class Task26 {
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
        int Q = s.nextInt();
        int P = s.nextInt();
        int q =0;
        int p =0;
        int d = 0;
        int z;


        for (int b = 1; b < num.length; b++) {
            if (A > num[b]) {

                A = num[b];
                y = b;
            }
        }


            num[Q] = q;
            num[P] = p;

            for (q = 0;q<p;q++){
                if (q<p){
                    q = num[d];
                    z = d;
                }
                }
        System.out.println(q);



        }

    }
