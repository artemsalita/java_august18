package lab8;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String b = "abcdefwxyz";
        int CA, CB, ca = 0, cb = b.length();

        CA = s.nextInt();
        CB = s.nextInt();
        int d = CA + CB;

        String Q, W;

        if (d>10){
            System.out.println("Сумма значений CA и CB должна быть меньше длины строки");
            return;
        }
        if (CA<0||CA>cb){
            System.out.println("Значение CA должно быть в интервале [0, длина строки)");
            return;
        }
        if (CB<0){
            System.out.println("Значение CB должно быть неотрицательно");
            return;
        }

        Q = b.substring(ca, CA);
        W = b.substring(d, cb);
        System.out.println(Q + W);

    }
}
