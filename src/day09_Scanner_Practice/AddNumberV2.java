package day09_Scanner_Practice;

import java.util.Scanner;

public class AddNumberV2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1+num2;
        System.out.println("the result is : " + result );

    }
}
