package mariam_practice;

import java.util.Scanner;

public class ageGroupNestedIfWithScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age: ");
        int age = scan.nextInt();
        String ageGroup="";
        if (age > 0 && age < 120) {
            if (age <= 2) {
                ageGroup=  " Infant";
                System.out.println(  " Group Infant");
            } else if (age >= 2 && age <= 5) {
                ageGroup="Todlar ";
                System.out.println(ageGroup="Group Todlar ");
            } else if (age >= 6 && age <= 9) {
                ageGroup="kid";
                System.out.println(ageGroup="Group kid");
            } else if (age >= 10 && age <= 12) {
                ageGroup="Pre Teen";
                System.out.println(ageGroup="Group Pre Teen");
            } else if (age >= 13 && age <= 17) {
                ageGroup="Teenager";
                System.out.println(ageGroup="Group Teenager");
            } else if (age >= 18 && age <= 20) {
                ageGroup="Young Adult";
                System.out.println(ageGroup="Group Young Adult");
            } else if (age >= 21 && age <= 39) {
                ageGroup="Adult";
                System.out.println(ageGroup="Group Adult");
            } else if (age >= 40 && age <= 49) {
                ageGroup="Aged Adult";
                System.out.println(ageGroup="Group Aged Adult");
            } else if (age >= 50 && age <= 54) {
                ageGroup="Middle Aged Adult";
                System.out.println(ageGroup="Group Middle Aged Adult");
            } else if (age >= 55 && age <= 64) {
                ageGroup="Very Young Senior";
                System.out.println(ageGroup="Group Very Young Senior");
            } else if (age >= 65 && age <= 74) {
                ageGroup="Young Senior";
                System.out.println(ageGroup="Group Young Senior");
            } else if (age >= 75 && age <= 84) {
                ageGroup="Senior";
                System.out.println(ageGroup="Group Senior");
            } else if (age >= 85) {
                ageGroup = "Old Senior";
                System.out.println( "Group Old Senior");

        }else{
            System.out.println("Invalid age");

            }

        }
    }
}