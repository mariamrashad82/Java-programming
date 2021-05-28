package day09_Scanner_Practice;

import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your name: ");
        String name = scan.next();
        System.out.println("nice to meet you !");
        System.out.println("how old are you : ");
        String age= scan.next();
        System.out.println("that is great age !");
    }
}
