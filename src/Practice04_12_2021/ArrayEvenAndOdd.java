package Practice04_12_2021;
import java.util.Arrays;
public class ArrayEvenAndOdd {
    public static void main(String[] args) {
        int [] nums = {4,1,3,12,5};
        int even = 0;
        int odd = 0;
        // String even += num + " " split by space -> String []
        for(int eachNum : nums) {
            if(eachNum % 2 == 0){  // checks odd: eachNum % 2 != 0 or eachNum % 2 == 1
                even++;
            } else {
                odd++;
            }
        }

        int [] evenNumbers = new int[even];
        int [] oddNumbers = new int[odd];

        /*
                i -> keep track of the indexes in your nums array
                e -> keep track of the indexes in our evenNumbers array
                o -> keep tracks of the indexes in our oddNumbers array
         */

        for(int i = 0, e = 0, o = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                evenNumbers[e++] = nums[i]; // 1
            } else {
                oddNumbers[o++] = nums[i];
            }
        }

        System.out.println( "Even : "   + Arrays.toString(evenNumbers));
        System.out.println(  "Odd : "   +  Arrays.toString(oddNumbers));











    }
}
