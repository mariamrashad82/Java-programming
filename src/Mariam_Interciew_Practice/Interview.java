package Mariam_Interciew_Practice;

import java.util.Arrays;

public class Interview {
    /*
    Compare arrays. Assign values of int arrayOne to int arrayTwo. And then compare if they are same/equal?
            EX: int[] arrayOne = {5, 10, 15, 20}

                and comparision...
     */


    public static void main(String[] args) {
        int[] array1 = {5, 1, 3, 2};
        int[] array2 = array1;
        System.out.println(Arrays.equals(array1, array2));
    }
}
