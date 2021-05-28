package Practice04_07_2021;

public class loopPrimeNumber {
    public static void main(String[] args) {
       // [IQ] Prime in rangeGiven a number. Print out all the prime numbers from 2 to that numberA prime number is
        // a number that is only divisible by 1 and itself.Ex:Input:50Output:
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
        int number = 50;

        // 5/2, 5/3, 5/4

        for(int j = 2; j <= number; j++) {
            boolean isPrime = true;

            for(int i = 2; i < j; i++){
                if(j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(j  + " ");
            }

        }




    }
}
