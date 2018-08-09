package lab5;

import java.util.Scanner;

/**
 * Created by pro-28 on 09.08.2018.
 */
public class Task5 {

    public static void main(String[] args) {

        double roadKm;
        double lengthFeet;
        double lengthM;
        double roadM;

        Scanner s = new Scanner(System.in);
//4
        roadKm = s.nextDouble();
        lengthFeet = s.nextInt();
//3

        roadM = roadKm*1000;
        lengthM = lengthFeet*0.305;
//2
        if (roadM<0){
            System.out.println("Расстояние между деревнями должно быть неотрицательно");
            return;
        }
        if (lengthFeet<0){
            System.out.println("Длина кабеля должна быть неотрицательна");
            return;
        }

        if (roadM<lengthM){
            System.out.println("Кабеля хватит. Расстояние меньше длины кабеля.");
        }else{
            System.out.println("Кабеля не хватит. Длина кабеля меньше расстояния.");
        }
//1

    }
}
