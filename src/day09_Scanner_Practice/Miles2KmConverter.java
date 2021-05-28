package day09_Scanner_Practice;

import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("########## miles to km converter########### ");
        System.out.println(" enter miles");
        double miles = scan.nextDouble();
        System.out.println("entre kilo: ");
        double kilometer = miles * 1.609;
        System.out.println( miles + " miles in kilometers : " + kilometer);

    }
}
