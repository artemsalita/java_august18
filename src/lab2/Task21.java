package lab2;

import java.util.Scanner;


public class Task21 {

    public static void main(String[] args) {

        int totalM;
        int partCm;
        int totalCm;
        int result;
        int result2;


        Scanner s = new Scanner(System.in);

        totalM = s.nextInt();
        partCm = s.nextInt();
        totalCm = totalM*100;

        if(totalM<0){
            System.out.println("Длина рулона должна быть положительна");
            return;
        }

        if(partCm<0){
            System.out.println("Расход материала должен быть положительным");
            return;
        }


        if (partCm>totalM){
            System.out.println("Материала не хватит даже на одно изделие");
            return;
        }




        result = totalCm/partCm;
        result2 = totalCm%partCm;
        System.out.println(result+"шт"+result2+"см");


        }
}



