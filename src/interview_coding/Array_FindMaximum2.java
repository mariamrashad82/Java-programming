package interview_coding;

public class Array_FindMaximum2 {
    public static void main(String[] args) {

    /*
        int[] nums = {7, 9, 4, 3, 1};
        for (int i = 0; i<nums.length; i++){

            int max = nums[0];
            if (nums[i] > max) {
                max = nums[i];
                System.out.println(max);
                */
                int[] nums = {7, 9, 4, 3, 1};
                for (int i = 0; i<nums.length; i++){

                    int min = nums[0];
                    if (nums[i] < min) {
                        min = nums[i];
                        System.out.println(min);
            }

        }
    }
}


