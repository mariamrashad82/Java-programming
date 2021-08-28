package interview_coding;
import java.util.*;

public class MoveAllZero_1_2_3 {
    public static void main(String[] args) {
        int[] nums = {3, -7, 0, 0, 1, 0, -2, 0, 6, 0, 9};

        System.out.println(Arrays.toString(moveAllZerosToTheEnd(nums)));
        System.out.println("=======");
        System.out.println(Arrays.toString(moveAllZerosToTheFirst(nums)));
        System.out.println("-------");
        System.out.println(Arrays.toString(moveToTheFirst2(nums)));



    }
    public static int[] moveAllZerosToTheEnd(int[] array){

        int[] allZerosToEnd = new int[array.length];

        for (int i = 0 , j=0; i < array.length; i++) {

            if (array[i] != 0){
                allZerosToEnd[j++] = array[i];
            }
        }

        return allZerosToEnd;
    }
    public static int[] moveAllZerosToTheFirst(int[] array){

        int[] allZerosToFirst = new int[array.length];// the size is as same as my original array

        // original array  {3, -7, 0, 0, 1, 0, -2, 0, 6, 0, 9] // i=4

        //                [0, 0, 0, 0, 0, 9, 6, -2, 1, -7, 3]

        // from Left to Right 0 to the end ++
        // from Right To Left last index to the first index --

        int LtoR = 0;
        int RtoL = array.length -1;

        for (int i = 0; i < array.length; i++) { // just count the i
            if (array[i] != 0){ // my index is not Zero
                allZerosToFirst[RtoL--] = array[i];
            }else{ // my index is Zero
                allZerosToFirst[LtoR++] = array[i];

            }
        }

        return allZerosToFirst;
    }

    public static int[] moveToTheFirst2 (int[] array){
        // {3, -7, 0, 0, 1, 0, -2, 0, 6, 0, 9]
        // I have 5 zeros
        int[] allZerosToFirst = new int[array.length];
        int countZeros = 5;
        for (int j = countZeros, i=0; i < array.length; i++) {

            if (array[i] != 0){
                allZerosToFirst[j++] = array[i];
            }
        }
        return allZerosToFirst;
    }


}
