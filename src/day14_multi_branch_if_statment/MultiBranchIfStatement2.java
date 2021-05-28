package day14_multi_branch_if_statment;

import java.util.Scanner;

public class MultiBranchIfStatement2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ENTER YOUR DAY");
        int day = scan.nextInt();
        if (day == 1) {
            System.out.println("monday");
        } else if (day == 2) {
            System.out.println("tuesday");
        } else if (day == 3) {
            System.out.println("thursday");
        } else {
            System.out.println("CODING JAVA");
        }
    }
}