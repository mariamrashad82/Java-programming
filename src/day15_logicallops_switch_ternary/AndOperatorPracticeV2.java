package day15_logicallops_switch_ternary;

import java.util.Scanner;

public class AndOperatorPracticeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your items");
        String item1= scan.next();
        boolean onSale = true;
        boolean freeShipping = true;


        if (item1. equals("wooden spoon")){
            System.out.println(onSale && freeShipping);
            System.out.println(" add t" +item1 + "to my cart");
        } else {
            System.out.println(" do not buy it");
        }
    }
}

