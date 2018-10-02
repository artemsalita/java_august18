package lab8;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String data = "abcdacadbacdaabaadc";
        String Q = s.nextLine(),W,E = " ";

        if (Q.length()!=2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }

       W = data.replace(Q,E);
        System.out.println(W);
    }
}
