package interview_coding;
import java.util.Arrays;

public class MoveAllZeros {

    public static void main(String[] args) {
        int [] nums = {2, 9, 0, 0, -7, 0, 5, 0, 2, -1, 0};
        System.out.println(Arrays.toString(moveZerosToTheEnd(nums)));
        System.out.println(Arrays.toString(moveZerosToTheFirst(nums)));
    }

    public static int[] moveZerosToTheEnd(int[] nums){
        int[] zerosAtEnd = new int[nums.length];

        for (int i = 0, j=0; i < nums.length; i++) {
            if (nums[i] != 0){
                zerosAtEnd[j++] = nums[i];
            }
        }
        return zerosAtEnd;
    }



    public static int[] moveZerosToTheFirst(int[] nums){
        int[] zerosAtFirst = new int[nums.length];
        int LtoR =0;
        int RtoL =nums.length -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zerosAtFirst[LtoR++] = nums[i];
            }else{
                zerosAtFirst[RtoL--] = nums[i];
            }
        }
        return zerosAtFirst;
    }


}
