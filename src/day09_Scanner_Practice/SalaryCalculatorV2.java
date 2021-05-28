package day09_Scanner_Practice;

import java.util.Scanner;

public class SalaryCalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre hourly rate: ");
        int HourlyRate = scan.nextInt();
        int weekly = HourlyRate *40;
        int monthly = weekly * 52/12;
        int annual = monthly * 12;
        System.out.println("weekly pay is: " + weekly);
        System.out.println("Monthly pay is: " + monthly);
        System.out.println("annual pay is: " + annual);
    }
}
