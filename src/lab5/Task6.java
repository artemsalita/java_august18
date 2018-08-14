package lab5;

import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {

        int shipKmH;
        int cometMS;
        int shipMS;

        Scanner s = new Scanner(System.in);

        shipKmH = s.nextInt();
        cometMS = s.nextInt();
      //  shipMS = s.nextInt();
        shipMS = shipKmH*5/18;

        if(cometMS<0){
            System.out.println("Скорость кометы должна быть неотрицательна");
            return;
        }
        if(shipMS<0){
            System.out.println("Скорость корабля должна быть неотрицательна");
            return;
        }

        if(cometMS<shipMS){
            System.out.println("Корабль догонит комету. Скорость кометы "+cometMS+" м/с меньше скорости корабля "+shipKmH+" км/ч");
        }
        if(cometMS>shipMS){
            System.out.println("Комета улетит от корабля. Скорость корабля "+shipKmH+" км/ч меньше скорости кометы "+cometMS+" м/с");
        }




    }
}
