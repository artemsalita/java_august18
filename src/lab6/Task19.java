package lab6;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        int a;
        int count = 0;
        int sum = 0;

        Scanner s = new Scanner(System.in);

        do {
            a = s.nextInt();
            count++;
            sum = sum + a;
        }
            while (sum <= 1000);
        System.out.println(count);

    }

}
