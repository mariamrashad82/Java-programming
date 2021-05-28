package day15_logicallops_switch_ternary;

import java.util.Scanner;

public class UsedCarSelectorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Car Model");
        String model = scan.next();
        double budget = 5000;
        double carPrice = 4500;

        if(budget >= carPrice && model.equals("Toyota")  || model.equals("Honda") || model.equals("Tesla") ){
            System.out.println("READY TO BUY MODEL = " + model + " price = " + carPrice);
        }else{
            System.out.println("NOT INTERESTED IN MODEL");
        }
    }
}
