package day15_logicallops_switch_ternary;

import java.util.Scanner;

public class GradeEvaluatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Grade");
        char grade = scan.next().charAt(0);
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("You Passed With grade " + grade);
        } else if (grade == 'D' ) {
            System.out.println("You Qualify for Retake " + grade);
        } else if ( grade == 'E') {
            System.out.println("FAIL Grade_ " + grade);
        } else {
            System.out.println(" INVALID GRADE" + grade);
        }
    }
}