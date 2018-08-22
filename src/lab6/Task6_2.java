package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 14.08.2018.
 */
public class Task6_2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int start;
        int end;

        if (a<b){
            start = a;
            end = b;

        }
        else {
            start = b;
            end = a;

        }
        while (start<=end){
            System.out.print(start + " ");
            start ++;
        }
    }

}
