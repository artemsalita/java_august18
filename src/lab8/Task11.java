package lab8;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String data = s.nextLine(),Q,W,E,R;

        //"abcdef    "
        //" pq"rt "
        //"  xyz  "
        //"  a b  "
        //p"w"

        Q = data.substring(0,1);
        R = data.substring(1);

        if (!Q .equals("\"")||!R .equals("\"")){
            System.out.println("Строка должна начинаться и заканчиваться кавычкой");
            return;
        }

        W = data.replace("\"","");
        E = W.replace(" ","");
        System.out.println(E);

    }
}
