package lab8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String b = "abcdacadbacdaabaadc";

        String a = s.nextLine();
        int m,l = 0;

        m =  b.indexOf(a);
        System.out.println(m);


    }
}
