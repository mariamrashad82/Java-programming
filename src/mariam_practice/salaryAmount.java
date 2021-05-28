package mariam_practice;

import java.util.Scanner;

public class salaryAmount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Welcome to our Company");
        System.out.println("Enter your salary amount ");
        double salaryAmount= scan.nextInt();
        System.out.println(" if you are working full time , please answer \n true \n false");
        boolean isFullTime = scan.nextBoolean();
        if(isFullTime==true){
            System.out.println("FULL TIME = " +(salaryAmount + 20000) );
        }else{
            System.out.println("PART TIME = " +(salaryAmount - 5000));
        }

    }
}
