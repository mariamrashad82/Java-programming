package day14_multi_branch_if_statment;

import java.util.Scanner;

public class YesOrNo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" are you sure you want to delete this filer?");
        boolean filer = scan.nextBoolean();
        if (filer == true) {
            System.out.println("your file will be deleted");
        } else if (filer == false) {
            System.out.println("file deletion cancelled");
        } else {
            System.out.println("Did file get deleted?_ true");
        }
    }
}