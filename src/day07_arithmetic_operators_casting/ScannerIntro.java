package day07_arithmetic_operators_casting;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please entre your name");
       // String firstName = "Maria"; // FIRST WAY
        String firstName = scan.next();
        System.out.println(" nice to meet you, " + firstName);



    }
}
