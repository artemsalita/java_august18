package lab7;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = 0;
        int l = 0;

        String rightChars = s.nextLine();
        String leftAmounts = s.nextLine();

        String[] chars = rightChars.split(" ");
        String[] amountsNum = leftAmounts.split(" ");

        int[] amounts = new int[amountsNum.length];

        if (chars.length != amountsNum.length) {
            System.out.println("Длины массивов не совпадают");
            return;
        }

        if (rightChars.isEmpty()) {
            System.out.println("Отсутствуют данные о символах");
            return;
        }

        if (leftAmounts.isEmpty()) {
            System.out.println("Отсутствуют данные о количествах");
        }

        for (int i = 0; i < amountsNum.length; i++) {
            amounts[i] = Integer.parseInt(amountsNum[i]);
        }



            for (int u = 0; u < amounts[t]; u++) {
                System.out.print(chars[t]);
            }

    }
}
