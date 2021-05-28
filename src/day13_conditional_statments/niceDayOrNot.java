package day13_conditional_statments;

import java.util.Scanner;

public class niceDayOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** WELCOME TO the weather *****");
        System.out.println( "put the temp ");
        // double temp = 71;
        double temp = scan.nextInt();

        if (temp <= 70 ) {
            System.out.println("it is a beautiful day" );
            System.out.println("lets code java");
        }else {
            System.out.println("it is kind of cold today");
            System.out.println("stay home and code java");
        }
        System.out.println("Thanks for u !");

    }
}
