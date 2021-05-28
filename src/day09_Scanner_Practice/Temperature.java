package day09_Scanner_Practice;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("+++++++F TO C CONVERTER PROGRAM+++++++++++");
        System.out.println("ENTER Fahrenheit Value :");
        double f = scan.nextDouble();
        double c = (f -32)* 5/9;
        System.out.println(f +"fahrenheit in celsius : " + c);

    }
}
