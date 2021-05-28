package mariam_practice;

import java.util.Arrays;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] nums = {645, 7465, 76, 8775, 66554};
        for (int i = 0; i < nums.length; i++) {
            int max = nums[0];
            int min = nums[0];
            if (nums[i] > max) {
                max = nums[i];
                System.out.println("max num = "+ max);


            }
            if (nums[i] < min) {
                min = nums[i];
                System.out.println(" min num = " + min);
            }




        }
    }


    }




