package Practice04_14_2021;

public class ArraySecondBiggest {
    public static void main(String[] args) {
        //[IQ] Second Biggest NumberGiven an Array of numbers.
        // Find and print the 2ndbiggest number.
        // Note the 2ndbiggest should be unique meaning it should be different from
        // the max numberExample:Input:[4,3,1,4,5,2,4,8,4,8]Output:5
        int [] nums = {4,3,1,4,5,2,4,8,5,8};
        int max = nums[0];        // 8
        int secondMax = nums[0];  // 7

        for(int eachNum : nums) {

            if(eachNum > max){
                secondMax = max;
                max = eachNum;
            }

            if(eachNum > secondMax && eachNum < max){
                secondMax = eachNum;
            }

        }

        System.out.println("max: " + max);
        System.out.println("2nd max: " + secondMax);

    }
}
