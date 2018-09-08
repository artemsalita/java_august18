package lab2;
import java.util.Scanner;
public class Task26 {
    public static void main(String[] args) {
        double initialVelocity;
        double time;
        double acceleration;
        double distance;
        Scanner s = new Scanner(System.in);
        initialVelocity = s.nextDouble();
        time = s.nextDouble();
        acceleration = s.nextDouble();
        if (time <= 0) {
            System.out.println("Время должно быть положительным");
            return;
        }
        if (initialVelocity < 0) {
            System.out.println("Время должно быть положительным");
            return;
        }
        distance = (initialVelocity * time) + ((acceleration * time * time) / 2);
        System.out.printf("%.2f", distance);
    }
}
