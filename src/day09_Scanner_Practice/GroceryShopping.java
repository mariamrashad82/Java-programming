package day09_Scanner_Practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre price for milk: ");
        double price1 = scan.nextDouble();
        System.out.println("entre price for bread: ");
        double price2 = scan.nextDouble();
        System.out.println("entre price for cucumber: ");
        double price3 = scan.nextDouble();
        double totalPrice = price1 + price2 + price3;
        System.out.println( " total price is :$" + totalPrice );




    }
}
