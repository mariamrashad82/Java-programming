package day16_swich_ternary;

public class ElevatorIf {
    public static void main(String[] args) {
        int floorNum = 1;
        if (floorNum == 1) {
            System.out.println(" floor 1 selected . companies: lobby");
        } else if (floorNum == 2) {
            System.out.println(" floor 2 selected . companies: cybertek");
        } else if (floorNum == 3) {
            System.out.println(" floor 3 selected . companies: bank of america");
        } else if (floorNum == 4) {
            System.out.println(" floor 4 selected . companies: Sephora");
        }else{
            System.out.println(" Invalid floor _ " + floorNum);
        }
    }
}