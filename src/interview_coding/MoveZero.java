package interview_coding;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int [] nums = {0,0,0,5,4,7,10,100,100};
        System.out.println(Arrays.toString(moveZerosToEnd(nums)));
    }
    /*
    write a program that can move all the zeros to the end of an array
     */

    public static int [] moveZerosToEnd(int [] arr){

        int [] zerosToEndArr = new int[arr.length];

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                zerosToEndArr[count++] = arr[i];
            }
        }
        return zerosToEndArr;


    }
}
