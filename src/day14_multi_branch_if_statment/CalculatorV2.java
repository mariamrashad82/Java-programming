package day14_multi_branch_if_statment;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER 2 NUMBER");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println(" ENTER OPERATOR (+ or _ or * or /)");
        char operator = scan.next().charAt(0);
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("INVALID NUMBER" + operator);
        }
    }
}