package day16_swich_ternary;

public class ElevatorSwitch {
    public static void main(String[] args) {
      int floorNum = 3;

      switch (floorNum){
         case 1:
            System.out.println(" floor 1 selected . companies: lobby");
         break;
         case 2:
            System.out.println(" floor 2 selected . companies: cybertek");
         break;
         case 3:
            System.out.println(" floor 3 selected . companies: bank of america");
         break;
         case 4:
            System.out.println(" floor 4 selected . companies: Sephora");
         break;
      default:
          System.out.println(" Invalid Number" + floorNum);
         break;

        }
    }
}