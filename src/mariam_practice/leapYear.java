package mariam_practice;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Favorite Year ");
        int year =scan.nextInt();
        if ( year %4 ==0){
            System.out.println("This year is leap");
        }else{
            System.out.println("This year not leap");
        }
    }
}
