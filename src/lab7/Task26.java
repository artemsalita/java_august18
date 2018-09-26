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


        int P = s.nextInt();
        int Q = s.nextInt();

        int A = num[P];
        P++;
        for (;P<=Q;P++){
            //System.out.print(num[P]);
            if (A>num[P]){
                A = num[P];

            }

        }System.out.println(A);




        }

    }
