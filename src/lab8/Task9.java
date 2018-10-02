package lab8;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();

        String Q,W;

        Q = data.substring(0,1);
        W = data.substring(1);

        //sABCD
        //Uxyz
        //F123

        if (Q .equals("s") ){
            W = W.toLowerCase();
            System.out.println(Q+W);
        }
        if (Q.equals("U")){
            W = W.toUpperCase();
            System.out.println(Q+W);
        }

        System.out.println(data);


    }
}
