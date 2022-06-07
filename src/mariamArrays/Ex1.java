package mariamArrays;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] num ={4,6,9,3,1};
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num,4));
        System.out.println(Arrays.binarySearch(num,6));
        System.out.println(Arrays.binarySearch(num,7));
        System.out.println(Arrays.binarySearch(num,2));

//        for (int i : num) {
//            System.out.println(i);

        }

    }

