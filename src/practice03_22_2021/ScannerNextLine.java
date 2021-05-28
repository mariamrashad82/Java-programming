package practice03_22_2021;

import java.util.Scanner;

public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        //System.out.println(" Enter your Name");
        //        String name = input.nextLine(); in the bigning make the code run right and accept to put data


        System.out.println(" Enter your Number");
        int number = input.nextInt();

        System.out.println(" Enter your Name");//  next line in the middle not accept to put data
        String name = input.nextLine();

        System.out.println("number = " + number);
        System.out.println("name = " + name);

        System.out.println("enter your word");
        input.nextLine();
        String word = input.nextLine();
        String word2 = input.nextLine();
        System.out.println("nice word");
        System.out.println("i love it");
    }

}
