package lab7;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String data = s.nextLine();
        int B = s.nextInt();
        int a = 0;
        String[] dataNum = data.split(" ");
        int[] num = new int[dataNum.length];
        for (int i = 0; i < dataNum.length; i++) {
            num[i] = Integer.parseInt(dataNum[i]);
        }

        if (B<0||B>=num.length){
            System.out.println("Число B должно быть в интервале [0, размер массива)");
            return;
        }
        //System.out.println(num[B]);
        for (int x = 0; x < num.length; x++){
            if (num[x]<num[B]){
                a++;
            }
        }
        System.out.println(a);


    }
}
