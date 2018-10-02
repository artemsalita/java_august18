package lab8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String data = s.nextLine(),Q,W,E;


        //"abcdef    "
        //" pq"rt "
        //"  xyz  "
        //"  a b  "

        W = data.replace("\"","");
        E = W.replace(" ","");
        System.out.println(E);



    }
}
