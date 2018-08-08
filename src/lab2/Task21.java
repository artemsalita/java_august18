package lab2;

import java.util.Scanner;


public class Task21 {

    public static void main(String[] args) {

        double totalM;
        double partCm;
        double partM;
        double result;

        Scanner s = new Scanner(System.in);

        totalM = s.nextDouble();
        partCm = s.nextDouble();
        partM = partCm/100;

        if (partCm>totalM){
            System.out.println("Материала не хватит даже на одно изделие");
            return;
        }

        if(partCm<0){
            System.out.println("Расход материала должен быть положительным");
            return;
        }

        if(totalM<0){
            System.out.println("Длина рулона должна быть положительна");
            return;
        }

        result = totalM/partM;
        System.out.println(result);


        }
}



