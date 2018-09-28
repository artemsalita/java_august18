package lab8;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String a = s.nextLine();
        String b = "abcdefwxyz";
        int u,t;

        if ( !b.contains(a)){
            System.out.println("Значение отсутствует в строке");
            return;
        }

        u = b.indexOf(a);
       // System.out.println(u);
        t = b.length()-u-1;
        System.out.println(t);


    }
}
