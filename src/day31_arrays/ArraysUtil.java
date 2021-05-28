package day31_arrays;
import java.util.*;
public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums = {9, 21, 10, -7, 10,100,80, 5, 3, 18};
       // print all num same line and convert from int to string
       System.out.println(Arrays.toString(nums));
       // sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        // print min value
        System.out.println("min value = " +  nums[0]);
         // print max value
        System.out.println("max value = " +  nums[nums.length-1]);

        String[] words = {"java", "python" , "c++", "sql", "ruby", "javascript"};
        System.out.println(" [ " + String.join( " , " , words)+" ] " );

        // sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        // sort words in reverse order
        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));

    }
}
