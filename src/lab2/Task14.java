package lab2;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        int edge;
        double volume;
        int edge3 = 3;

        Scanner s = new Scanner(System.in);
        edge = s.nextInt();

        if (edge <=0 ){
            System.out.println("Значение edge должно быть положительным");
            return;
        }

        volume = Math.pow(edge,edge3);
        System.out.println(volume);
    }

}
