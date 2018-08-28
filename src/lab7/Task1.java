package lab7;

import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by pro-28 on 28.08.2018.
 */
public class Task1 {

    public static void main(String[] args) {

        int A;
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        A = s.nextInt();

        String[] arr = data.split(" ");

        if (data.isEmpty()){
            System.out.println("Исходная строка пуста");
            return;
        }

        if (A<0||arr.length<A){
            System.out.println("Число A должно быть в интервале [0, размер массива)");
            return;
        }
        System.out.println(arr[A]);


    }

}
