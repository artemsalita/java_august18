package lab2;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int edge;
        int height;
        int area;

        edge = s.nextInt();
        height = s.nextInt();

        if (edge <=0 ){
            System.out.println("Длина основания треугольника должна быть положительна");
            return;
        }

        if (height <=0){
            System.out.println("Высота треугольника должна быть положительна");
            return;
        }
        area = edge*height/2;
        System.out.println(area);

    }

}
