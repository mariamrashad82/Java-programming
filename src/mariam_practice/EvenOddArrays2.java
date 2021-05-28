package mariam_practice;

import java.util.Arrays;

public class EvenOddArrays2 {
    public static void main(String[] args) {
        //Even and odd ArraysGiven an array with
        // values: 1,2,-3,4,-34,55,78,90,33,10-Take
        // our all the even numbers from the array and put them into a new array.
        // Print the new array-Take our all the oddnumbers from the array and put them into a new array.
        // Print the new array
        int[] numbers ={1,2,-3,4,-34,55,78,90,33,10};
        int odd = 0;
        int even = 0;

        System.out.print(Arrays.toString(numbers) + "\n");
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i]%2==0){
                even = numbers[i];
                even = i;
                System.out.println("Even Numbers = " + numbers[i]);
            }
            if(numbers[i]%2!=0){
                odd= numbers[i];
                odd = i;
                System.out.println("Odd Numbers = " + numbers[i]);





            }

        }

    }
}
   //int [] nums ={1,2,3,4,5};
//
//      for(int i=0;i<nums.length/2;i++){
//          int temp = nums[i];
//          nums[i] = nums[nums.length-(i+1)];
//          nums[nums.length-(i+1)] = temp;
//      }
//
//      //Do not change below statement:
//      System.out.println(Arrays.toString(nums));