package lab6;

public class Task11 {

    public static void main(String[] args) {

        int a = 100;
        int b = 500;
        int c = 101;

        while (c <= b) {
            System.out.print(a+" ");
            a = a + c;
            c ++;

        }
        System.out.println(a);


    }

}
