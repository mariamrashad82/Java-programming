package day24_loops;

import java.util.Scanner;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;
        do {
         System.out.println("Enter Pin Code ");
          pinCode = scan.nextInt();

        } while ( pinCode != secretPinCode);
        System.out.println(" Welcome to your account");
    }

    }










