package lab6;

public class Task16 {

    public static void main(String[] args) {

        double a = 20;
        double b = 40;
        double c = 21;
        int a3 = 3;

        while (c <= b) {
            System.out.print(Math.pow(a,a3) + " ");
            a = Math.pow(a,a3) + Math.pow(c,a3);
            c++;
        }



    }

}
