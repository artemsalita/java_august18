package lab6;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        int V;
        int i = 1;
        int n = 9;


        Scanner s = new Scanner(System.in);
        V = s.nextInt();

        while (i <= n) {
            System.out.println(i + "x" + V + "=" + V * i);
            i++;

        }
    }

}


