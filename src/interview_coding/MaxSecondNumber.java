package interview_coding;

import java.util.Arrays;

public class MaxSecondNumber {
    public static void main(String[] args) {
        int[]nums = {2653, 4367, 31231, 8766};
   // }
   // public void GetTwoMaxValues(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;
        Arrays.sort(nums);
        System.out.println("Max1 - " + (nums[nums.length-1]));
        System.out.println("Max2 - " + (nums[nums.length-2]));

    }
}
