package lab5;

import java.util.Scanner;

/**
 * Created by pro-28 on 14.08.2018.
 */
public class Task12 {

    public static void main(String[] args) {


        String x;
        Scanner s = new Scanner(System.in);

        x = s.nextLine();
        if(!"a".equals(x)&&!"b".equals(x)&&!"c".equals(x)&&"d".equals(x))
        if("a".equals(x)){
            System.out.println("a+");
        }
        else{
            System.out.println("a");
        }
        if("b".equals(x)){
            System.out.println("b+");
        }
        else{
            System.out.println("b");
        }
        if("c".equals(x)){
            System.out.println("c+");
        }
        else{
            System.out.println("c");
        }
        if("d".equals(x)){
            System.out.println("d+");
        }
        else{
            System.out.println("d");
        }

    }
}