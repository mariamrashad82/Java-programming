package mariam_practice;

import java.util.Scanner;

public class booleanTrueOrFalse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLEASE ENTER BOOLEAN VALUE");
        boolean value=scan.nextBoolean();
        if(value==true){
            System.out.println( value + "-> FALSE");
        }else{
            System.out.println( value + "-> TRUE");
        }
    }
}
