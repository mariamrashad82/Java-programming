package day13_conditional_statments;

import java.util.Scanner;

public class ATMPinCodeProgramV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** WELCOME TO DO BANK ATM *****");
        System.out.println("enter your pin code");
        double secretPinCode = 2012;
        double inputPinCode = scan.nextInt();

        if (secretPinCode == inputPinCode ) {
            System.out.println("welcome to your account " + secretPinCode );
            System.out.println("you can check your balance");
        }else {
            System.out.println(" your pin code is wrong " + inputPinCode + " please try again");
        }
            System.out.println("Thank Ypu For Using  ATM !");

    }
}


