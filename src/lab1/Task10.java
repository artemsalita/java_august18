package lab1;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        String user;
        String pass;
        String host;
        String port;
        String db;
        Scanner s;
        s = new Scanner(System.in);
        user = s.nextLine();
        pass = s.nextLine();
        host = s.nextLine();
        port = s.nextLine();
        db = s.nextLine();
        System.out.println("User ID ="  +user +";  Password=" +pass +";\n" +

                            "Host=" +host+";Port=" +port+";Database=" +db+"");
    }
}
