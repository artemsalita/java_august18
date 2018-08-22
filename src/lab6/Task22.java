package lab6;

import java.util.Scanner;

/**
 * Created by pro-28 on 22.08.2018.
 */
public class Task22 {

    public static void main(String[] args) {


        int a;
        int b =10;
        Scanner s = new Scanner(System.in);

        a = s.nextInt();

        //if(!"a".equals(x)&&!"b".equals(x)&&!"c".equals(x)&&"d".equals(x))

           while (b>=10&&b<=20) {



               if (a == b) {
                   System.out.println(a + "+");
               }
               else{
                   System.out.println(b+" ");

               }
               b++;

           }

    }
}


