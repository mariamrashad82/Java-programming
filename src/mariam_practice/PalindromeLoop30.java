package mariam_practice;

import java.util.Scanner;

public class PalindromeLoop30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter your word");
        String word = input.next();
        int start = 0;
        int end = word.length();

        for (int i = start; i <= word.length() / 2; i++) {
            if (word.charAt(start) == word.charAt(end - 1)) {

                System.out.println(word + " is present");
                break;


            } else {
                System.out.println(" is not present");
                break;
            }

        }
    }
}


