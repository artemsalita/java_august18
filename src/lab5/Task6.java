package lab5;

import java.util.Scanner;

public class Task6 {


    public static void main(String[] args) {

        double shipKmH;
        double cometMS;
        double shipMS;

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
            System.out.printf("Корабль догонит комету. Скорость кометы %.4f м/с меньше скорости корабля %.4f км/ч",cometMS,shipKmH);
        }
        if(cometMS>shipMS){
            System.out.printf("Комета улетит от корабля. Скорость корабля %.4f км/ч меньше скорости кометы %.4f м/с",shipKmH,cometMS);
        }




    }
}
