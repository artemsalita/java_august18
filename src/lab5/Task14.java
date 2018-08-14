package lab5;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {


        int leftA;
        int leftB;
        int rightA;
        int rightB;

        Scanner s = new Scanner(System.in);

        leftA = s.nextInt();
        leftB = s.nextInt();
        rightA = s.nextInt();
        rightB = s.nextInt();

        if(leftB<leftA) {
            System.out.println("Значение A должно быть меньше значения B");
            return;
        }
        if(rightB<rightA) {
            System.out.println("Значение A должно быть меньше значения B");
            return;
        }
        if(rightA<leftB&&leftA<rightB){
            System.out.println("пересекаются");
        }
        else {
            System.out.println("не пересекаются");
        }
    }
}