package day09_Scanner_Practice;

import java.util.Scanner;

public class CentDollarsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" cents : ");
        int cents = scan.nextInt();
        int dollars = cents / 100 ;
        int remainingCent = cents % 100 ;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println( "Remaining Cent = "+ remainingCent  );
        System.out.println("in " + cents + " cents : " + dollars + " dollars " + remainingCent + " cents");
    }
}
