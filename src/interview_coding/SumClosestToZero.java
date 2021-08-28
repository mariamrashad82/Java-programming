package interview_coding;
import java.util.Arrays;

public class SumClosestToZero {
    public static void main(String[] args) {
        int[] nums = {0, -6, -2, 5 }; // result is [7, -6]
        System.out.println(Arrays.toString(closeToZero(nums)));
    }

    public static int[] closeToZero(int[] nums){
        int [] closToZero = new int[2];

        int minSum = nums[0] + nums[1]; // -6
        minSum = Math.abs(minSum); // change it to positive +6
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++){
                sum = nums[i]+nums[j];
                sum = Math.abs(sum);

                if (sum < minSum){
                    minSum = sum;
                    closToZero[0] = nums[i];
                    closToZero[1] = nums[j];
                }
            }
        }

        return closToZero;
    }
}
