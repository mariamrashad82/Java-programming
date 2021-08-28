package interview_coding;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[]firstArray={23,45,12,78,4,90,1};
        int[]secondArray={77,11,45,88,32,56,3};
        int one = firstArray.length;
       	int two = secondArray.length;
        int[] result = new int[one + two];
        System.arraycopy(firstArray, 0, result, 0, one);
        System.arraycopy(secondArray, 0, result, one, two);
        System.out.println(Arrays.toString(result));
            }
    }

