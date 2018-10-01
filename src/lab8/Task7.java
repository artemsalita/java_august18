package lab8;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String A = s.nextLine();
        int q=0,q1=1,w=3,w1=5,e=7,e1=10,r=12;
        String Q,W,E,R;

        Q = A.substring(q,q1+1);
        W = A.substring(w,w1+1);
        E = A.substring(e,e1+1);
        R = A.substring(r);

        //4607009520018
        //123456789012
        //12345678901234567890

        if (A.length()>13){
            System.out.println("Некорректная длина штрих-кода");
            return;
        }

        if (A.length()<13){
            System.out.println("Некорректная длина штрих-кода");
            return;

        }

        System.out.println("Код страны: "+Q);
        System.out.println("Код изготовителя: "+W);
        System.out.println("Код товара: "+E);
        System.out.println("Контрольное число: "+R);

    }
}
