package lab8;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String b = "abcdefwxyz";
        String CA,CB;
        CA = s.nextLine();
        CB = s.nextLine();
        String v;
        int m,t,z;


        m = b.indexOf(CA);
        t = b.indexOf(CB);

        if (m<0){
            System.out.println("Значение CA отсутствует в строке");
            return;
        }

        if (t<0){
            System.out.println("Значение CB отсутствует в строке");
            return;
        }

        if (m<t){
            m++;
            v = b.substring(m,t);
            System.out.println(v);

        }

        if (m>t){
            z = m;
            m = t;
            t = z;

            m++;
            v = b.substring(m,t);
            System.out.println(v);
        }

    }
}
