package day15_logicallops_switch_ternary;

import java.util.Scanner;

public class NotLogicalOperatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER AGE ");
        int age = scan.nextInt();
        if (!(age > 7)) {
            System.out.println("NEED TO SIT IN CAR SEAT");
        } else {
            System.out.println(" Do Not Need To Seat In Car Seat");

        }
    }
}