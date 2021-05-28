package day24_loops;
import java.util.Scanner;
import java.util.Random;

public class GussTheNumberRandom {
    public static void main(String[] args) {
            Random randomNum = new Random();
            Scanner scan = new Scanner(System.in);
            //System.out.println(randomNum.nextInt(101));
            int secretNumber = randomNum.nextInt(101);
            int guessingNumber = 0;
            do {
                System.out.println("Guess the secret number");
                guessingNumber = scan.nextInt();
                if (guessingNumber > secretNumber) {
                    System.out.println("wrong, your number is too large");
                } else if (guessingNumber < secretNumber) {
                    System.out.println("wrong, your number is too small");
                }
            } while (secretNumber != guessingNumber);

            System.out.println("Congratulations, you won! secret number:" + secretNumber);
        }

    }



