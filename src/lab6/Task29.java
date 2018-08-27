package lab6;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {

        int a;
        int b;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        if (a < b) {
            while (a <= b) {
                if (a % 7 == 0) {
                    sum = sum + a;
                }
                a++;
            }
            System.out.println("Ответ:" + sum);
        } else {
            while (b <= a) {
                if (b % 7 == 0) {
                    sum = sum + b;
                }
                b++;
            }
            System.out.println("Ответ:" + sum);
        }
    }
}