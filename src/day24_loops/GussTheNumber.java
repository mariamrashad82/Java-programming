package day24_loops;
import java.util.Scanner;
public class GussTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber =  100;
        int guessingNumber;
        do {
        System.out.println("Enter Guessing ");
            guessingNumber = scan.nextInt();
        } while ( guessingNumber != secretNumber);
        System.out.println(" Congratulation : you win !");

    }
}