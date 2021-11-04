package interview_coding;

import java.util.Arrays;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome2(123321));

    }
    public static boolean isPalindrome2(int number) {
        // 123321 ==> palindrome
        // I need to reverse the number ==> then check the reverse with original one
        // if they are equal ==> number is palindrome
        // how I can reverse the number?
        // How I can print the last digit of number?

        // how I can decrease my digits ==> number/10 ==> 1221/10 => 122/10 ==> 12/10==
        // 1/10 = 0
        int lastDigit = 0;
        int copyNum = number;
        int reverse = 0;
        // 2332

        while (copyNum != 0) { // true --> false
            lastDigit = copyNum % 10;// 2 => 3 => 3 => 2
            reverse = (reverse * 10) + lastDigit;
            // 0*10 + 2 = 2
            // 2*10 + 3 = 23
            // 23*10 + 3 = 233
            // 233*10 + 2 = 2332
            copyNum /= 10;  // ( copyNum = copyNum / 10 )
            // 2332/10 = 233 / 10 ==> 23/10 -> 2/10 ==> 0
        }
        // reverse = 2332

        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }

}


