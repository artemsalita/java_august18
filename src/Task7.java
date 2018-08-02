import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {
        String a;
        Scanner s;
        s = new Scanner(System.in);
        a = s.nextLine();
        System.out.println("SELECT first_name, last_name, group \n" +
                "FROM students WHERE student_id = " + a);
    }
}