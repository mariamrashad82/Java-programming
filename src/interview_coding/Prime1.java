package interview_coding;
import java.util.*;
public class Prime1 {
    public static void main(String[] args) {
        System.out.println(isPrime(11));



    }
    // prime number is a number which is just divisible by itself and one
    // EX: 8 ==> is not prime because its divisible by 1, 2, 4, 8
    // 17 is prime ==> is only divisible by 1 and 17
    // 0123456789


    public static boolean isPrime(int num) {
        if (num < 2) { // if my number is less than 2 => ots not a Prime
            return false;
        }
        // 15
        //  2, 3, 4, 5, 6, 7, ... , 14
        // if you can not find match between 2 and half of the target number==>
        // you number is Prime you don't need to check second half
        for (int i = 2; i < num / 2; i++) { // 15 ==> 2 to this target number
            if (num % i == 0) { // my number is not prime
                return false;
            }
        }
        return true;
    }
}
