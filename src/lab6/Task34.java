package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 28.08.2018.
 */
public class Task34 {

    public static void main(String[] args) {


        String F;
        int W;
        int H;
        int h = 0;
        int w = 0;
        Scanner s = new Scanner(System.in);
        F = s.nextLine();
        W = s.nextInt();
        H = s.nextInt();

        while (h<H){

            while (w<W){
                w++;
                System.out.print(F);
            }
            System.out.println();
            w=0;
            h++;
        }


    }
}