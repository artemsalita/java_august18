package lab7;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numerals = s.nextLine();
        String[] num = numerals.split(" ");
        int[] nummers = new int[num.length];
        double average;
        double sum = 0;


        for (int i = 0; i < num.length; i++) {
            nummers[i] = Integer.parseInt(num[i]);
        }
        for (int j = 0; j < nummers.length; j++) {
            sum += nummers[j];
        }
        average = sum / nummers.length;
    }
}
