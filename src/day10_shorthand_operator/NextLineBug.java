package day10_shorthand_operator;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your rent and month   ");
        double rent = scan.nextDouble();
        scan.nextLine();
        String month = scan.nextLine();
        System.out.println(" my rent is  " + rent );
        System.out.println("month = " + month );

//// answer
// enter your rent and month
//
//900
//on may
// my rent is  900.0
//month = on may
//
//Process finished with exit code 0

    }

}
