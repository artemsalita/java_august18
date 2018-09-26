package lab7;

import java.util.Arrays;
import java.util.Scanner;


public class Task28_1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();

        String[] dataNum = data.split(" ");
        int[] num = new int[dataNum.length];
        for (int i = 0; i < dataNum.length; i++) {
            num[i] = Integer.parseInt(dataNum[i]);
        }

        int A = num[0];

        Arrays.sort(num);

        for (int g = 0; g < num.length; g++) {
            System.out.print(num[g] + " ");
        }

    }
}

