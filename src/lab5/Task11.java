package lab5;

import java.util.Scanner;

/**
 * Created by pro-28 on 09.08.2018.
 */
public class Task11 {

    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

if (a<b&&b<c){
    System.out.println("Выполняется");
    return;
}


if (a>b&&b<c){
    System.out.println("Не выполняется");
    return;
}
    }
}
