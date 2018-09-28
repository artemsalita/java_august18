package lab8;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        String b = "abcdefwxyz";
        int CA,CB;
        String m;
        CA = s.nextInt();
        CB = s.nextInt();

        if (CA>CB){
            System.out.println("Значение CA должно быть меньше CB");
            return;
        }

        if (CA<0||CA>b.length()){
            System.out.println("Значение CA должно быть в интервале [0,длина строки)");
            return;
        }
        if (CB<0||CB>b.length()){
            System.out.println("Значение CB должно быть в интервале [0,длина строки)");
            return;
        }

        m = b.substring(CA,CB+1);
        System.out.println(m);


    }
}
