import java.util.Scanner;

/**
 * Created by pro-28 on 31.07.2018.
 */
public class Task2 {
    public static void main(String[] args){
        //объявление переменной а
     String a; //переменная для хранения вводимой строки
        Scanner s; //переменная для сканера
        s = new Scanner(System.in); //создаем сканер для чтения из консоли
        a = s.nextLine(); //читаем из консоли, сохраняем в а
        System.out.println("Мы стремимся к " +a);

    }

}

