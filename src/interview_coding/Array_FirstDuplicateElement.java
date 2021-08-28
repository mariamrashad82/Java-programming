package interview_coding;

import java.sql.Array;
import java.util.Arrays;

public class Array_FirstDuplicateElement {
    public static void main(String[] args) {


      /*
    write a program that can find the first duplicated element from the array
     */
int[] arr = {1,2,1,4,6,7,5,8,9,7,5};
        Arrays.stream(arr).distinct().limit(1).forEach(System.out::println);



}
}


