package lab7;

/**
 * Created by pro-28 on 28.08.2018.
 */
public class Task0 {

    public static void main(String[] args) {

        String[] a; // объявлкение массива для строк

        int n = 5;
        a = new String[n]; // то же самое
        a = new String[5]; //инициализаци массива длиной в 5 элементов
        a[0]= "x"; //инициализация элемента массива
        a[1]= "y";
        a[2]= "z";
        a[3]= "w";
        a[4]= "u"; //последний элемент массива
        System.out.println(a[0]);//обращение к элементу массива
        System.out.println(a[1]);//
        a= new String[]{"a","s","d","f"};//inline- инициализация
        System.out.println(a.length);//печать длины массива

        a = "q;w;e;r;t;y".split(";");//разбиение строки по разделителю
        System.out.println(a[3]); // r
        System.out.println(a[0]); // q

        System.out.println(a[99]); //java.lang.ArrayIndexOutOfBoundsException: 99 ощибка длины массива

    }
}
