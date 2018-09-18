package lab7;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String left = s.nextLine();
        String right = s.nextLine();

        String[] left1 = left.split(" ");
        String[] right1 = right.split(" ");

        int[] numleft = new int[left1.length];
        int[] numright = new int[right1.length];

        if (left1.length!=right1.length){
            System.out.println("Размеры массивов должны быть одинаковы");
            return;
        }

        for (int i=0;i<left1.length;i++){
            numleft[i] = Integer.parseInt(left1[i]);
            numright[i] = Integer.parseInt(right1[i]);
            System.out.print(numleft[i]*numright[i]+" ");
        }
    }
}
