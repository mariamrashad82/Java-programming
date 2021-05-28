package day13_conditional_statments;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
       // Scanner scan = new Scanner(System.in);
        System.out.println("BonusCalculator");
        double bounus = 0;
        double saleAmount = 500.0;
        //double saleAmount = scan.nextInt();

        if (saleAmount <= 2000 ) {
            System.out.println("good job you qualified for bones ");
            bounus = 50.0;

        }else {
            System.out.println(" great job you are qualified for full bones ");
            bounus = 100.0;
        }
        System.out.println(" your total bonus : $" + bounus);
    }
}
