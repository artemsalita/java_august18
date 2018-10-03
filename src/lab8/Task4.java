package lab8;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String b = "abcdacadbacdaabaadc";
        String a = s.nextLine();
        int m,l;

        if (a.length()>2||a.length()<2){
            System.out.println("Вводимая строка должна содержать ровно 2 символа");
            return;
        }

       for (l = 0;l<b.length();) {

            m = b.indexOf(a,l);
            System.out.println(m+" ");
           //System.out.print(l);
           //l = m;


        }
        //System.out.print(l);
    }
}
