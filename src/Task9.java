import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        String cx;
        String cy;
        String r;
        String fill;
        Scanner s;
        s = new Scanner(System.in);
        cx = s.nextLine();
        cy = s.nextLine();
        r = s.nextLine();
        fill = s.nextLine();
        System.out.println("<circle cx=\""+cx+"\" cy=\""+cy+"\"\n" +
                           "r=\""+r+"\" fill=\""+fill+"\"/>");
    }
}
