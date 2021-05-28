package day10_shorthand_operator;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What ia the weather today?   ");
       // String answer = scan.next();//print one word
        String answer = scan.nextLine();
        // print the whole sentence.
        System.out.println( answer + " WOOOOOW it is really nice weather today");

    }
}
