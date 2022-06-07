package mariamArrays;

import java.util.Arrays;

public class MultiDimentsional {
    public static void main(String[] args) {
        int[][] nums = {{12,3,6,},{69,89,65,77}};
        // gonna print hash code
      //  System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
          //  System.out.println("Up : " + i);
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();

        }
    }
}
