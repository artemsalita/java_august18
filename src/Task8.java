import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {
        String a;
        String b;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextLine();
        b = s.nextLine();
        System.out.println("INSERT INTO points (x, y) VALUES ('"+a+" ', ' " +b+ " ')");
    }
}
