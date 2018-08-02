package lab1;

import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        String a;
        String b;
        String c;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextLine();
        b = s.nextLine();
        c = s.nextLine();
        System.out.println("Квадратное уравнение "+a+"*x*x + "+b+"*x + "+c+" = 0.\n" +
                           "Его дискриминант вычисляется по формуле: d = "+b+"*"+b+" - 4*"+a+"*"+c+"");
    }
}
