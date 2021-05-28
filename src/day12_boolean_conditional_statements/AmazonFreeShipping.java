package day12_boolean_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter total price");
       double totalPrice = scan.nextInt();
        if (totalPrice >= 25) {
            System.out.println("free shipping eligible $" + totalPrice);
        }else {
            System.out.println(" free shipping not eligible $" + totalPrice);
        }
            System.out.println(" *****THANK FOR SHOPPING FROM AMAZON*****");

        }
}
