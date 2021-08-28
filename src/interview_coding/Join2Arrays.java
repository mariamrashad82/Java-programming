package interview_coding;

import java.util.Arrays;

public class Join2Arrays {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {6, 7, 8, 9};
      //  int[] num2 = {6, 7, 8, 9,10};
        System.out.println(Arrays.toString(joinArrays(num1,num2)));
    }
    public static int[] joinArrays(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length];
        for (int i = 0; i < num1.length; i++) {
            result[i] = num1[i];

        }
        for (int j = 0; j < num2.length; j++) {
         //   result[j+ num2.length] = num2[j];
            result[j+ num2.length+1] = num2[j];




        }

       return result;

    }

}

