package lab2;
import java.util.Scanner;
public class Task25 {
    public static void main(String[] args) {
        double velocity1;
        double velocity2;
        double distance;
        double time;
        Scanner s = new Scanner(System.in);
        velocity1 = s.nextDouble();
        velocity2 = s.nextDouble();
        distance = s.nextDouble();
        if (velocity1 < 0 || velocity2 < 0) {
            System.out.println("Скорость должна быть неотрицательна");
            return;
        }
        if (distance < 0) {
            System.out.println("Расстояние должно быть неотрицательно");
            return;
        }
        time = distance / (velocity1 + velocity2);
        System.out.printf("%.4f", time);
    }
}
