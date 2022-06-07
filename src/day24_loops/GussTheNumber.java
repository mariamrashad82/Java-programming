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
        } while ( guessingNumber != secretNumber);//when condition become true skip the loop (wrong)go up (right) go down
        System.out.println(" Congratulation : you win !");

    }
}