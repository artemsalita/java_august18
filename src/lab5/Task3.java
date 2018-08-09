package lab5;

import java.util.Scanner;

/**
 * Created by pro-28 on 09.08.2018.
 */
public class Task3 {

    public static void main(String[] args) {

        int K;
        double plusK;
        int minusK;

        Scanner s = new Scanner(System.in);

        K = s.nextInt();

        plusK = Math.sqrt(K);
        minusK = K*K;

        if (K>0){
            System.out.println(plusK);

        }
        else {
            System.out.println(minusK);
        }
    }
}
