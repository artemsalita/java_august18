package lab2;

import java.util.Scanner;

/**
 * Created by pro-28 on 02.08.2018.
 */
public class Task12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edge;
        edge = s.nextInt();
        if (edge <=0 ){
            System.out.println("Значение должно быть положительным");
            return;
        }
        int result;
        result = 6 * edge * edge;
        System.out.println(result);

    }
}
