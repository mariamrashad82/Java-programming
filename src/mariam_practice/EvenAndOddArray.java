package mariam_practice;

public class EvenAndOddArray {
    public static void main(String[] args) {
        //Write a program that can count the even
        // and odd number from an array of integers
        // UseforeachtomakeiteasierEx:Input: [4,1,3,12,5]Output: Even:2Odd: 3

        int[] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;

        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
                even++;


            } else if (eachNum % 2 != 0){
                odd++;

            }








        }
        System.out.println("odd = " + odd);
        System.out.println("Even = " + even);
    }

}