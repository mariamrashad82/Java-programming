package practice03_10_2021;

import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("NEXT THE LENGTH OF THE MOVIE ");
        double movieLength = input.nextDouble();
        double price = 0;

        if (movieLength == 1) {
            price = 8.99;
            System.out.println("price = " + price);
        }
        if (movieLength == 1.5) {
            price = 10.50;
            System.out.println("price = " + price);
        }
        if (movieLength == 2.0) {
            price = 12.99;
            System.out.println("price = " + price);
        }
        if (movieLength == 2.5) {
            price = 14.50;
            System.out.println("price = " + price);
        }
        if (movieLength == 3.0) {
            price = 15.99;
            System.out.println("price = " + price);
        }
    }
}