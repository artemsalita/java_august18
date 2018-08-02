package lab2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by pro-28 on 02.08.2018.
 */
public class Task7 {
    public static void main(String[] args) {
        Double aRad;
        int aDeg;
        Scanner s = new Scanner(System.in);
        aDeg = s.nextInt();
        aRad = aDeg*Math.PI/180;
        System.out.printf("%.5f",aRad);
    }
}
