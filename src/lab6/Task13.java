import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        int a = -10;
        int b ;
        int c;

        c = a + 1;

        Scanner s = new Scanner(System.in);

       b = s.nextInt();

        while (c <= b) {
            System.out.print(a+" ");
            a = a + c;
            c ++;

        }

        if (b<-10){
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }

        if (b>10000){
            System.out.println("Значение b должно быть в интервале [-10,10000]");
            return;
        }
        System.out.println(a);
    }
}

