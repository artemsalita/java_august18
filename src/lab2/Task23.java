package lab2;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        int lengthSeconds;
        int lengthMin;
        int lengthHour;

        Scanner s = new Scanner(System.in);
        lengthSeconds = s.nextInt();

        lengthHour = lengthSeconds % 3600;
        lengthMin = lengthHour % 60;

        System.out.println(lengthMin + " " + lengthHour);


    }
}
