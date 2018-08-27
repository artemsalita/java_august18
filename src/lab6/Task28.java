package lab6;

public class Task28 {


    public static void main(String[] args) {

        int a = 100;
        int b = 1000;
        int count = 0;

        while (a<=b){

            if (a%13 == 0){

                System.out.print(a+"+ ");
                count++;


            }
            System.out.print(a+" ");
            a++;

        }
        System.out.println("Ответ:"+ count);


    }



}
