package lab8;

import java.util.Scanner;

public class Task11_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String data = s.nextLine(),Q,W,E,R;
        int S,D;

        //"abcdef    "
        //" pq"rt "
        //"  xyz  "
        //"  a b  "
        //p"w"
        //"   12345"

        if (!data.startsWith("\"")||!data.endsWith("\"")){
            System.out.println("Строка должна начинаться и заканчиваться кавычкой");
            return;
        }
        W = data.substring(1,data.length()-1).trim();
        System.out.println(W);

    }
}
