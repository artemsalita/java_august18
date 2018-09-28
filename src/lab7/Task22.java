package lab7;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    String data = s.nextLine();
    String[] dataNew = data.split(" ");

    int u,z,n = 1;
    String b = dataNew[n];


    for (z = 0;z < dataNew.length;z++) {

        for (u = 0; u < dataNew.length; u++) {
            if (b.equals(dataNew[u])) {
                System.out.println("Повторения есть");
                return;

            }

            if (!b.equals(dataNew[u])) {
                System.out.println("Повторений нет");
                return;

            }
        }
        u++;
        n++;
    }

}
}