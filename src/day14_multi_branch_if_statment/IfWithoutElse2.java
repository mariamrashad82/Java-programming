package day14_multi_branch_if_statment;

import java.util.Scanner;

public class IfWithoutElse2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE YEAR");
        int year = scan.nextInt();
        if (year == 2020) {
            System.out.println("COVID19 PANDEMIC YEAR");
            System.out.println("WEAR MUSK,And Keep 6 feet distance");
        }
        System.out.println("KEEP CODING JAVA");
    }

}

