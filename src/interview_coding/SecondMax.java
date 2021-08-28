package interview_coding;
import java.util.*;

public class SecondMax {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 0, -2, -7, 2, 5, 9};
        System.out.println("(Arrays.toString(sortWithoutMethods(numbers))) = " + (Arrays.toString(sortWithoutMethods(numbers))));
        //System.out.println(Arrays.toString(sortWithoutMethods(numbers)));
        //System.out.println(Arrays.toString(removeDuplicate(numbers)));


    }
    public static int secondMax(int[] num) {
        int secondMax = 0;

        // Arrays.sort(num); first way to sort
        // Collections.sort(list<Integer> )
        // [9, 9, 3, 2, 0, -2, -7]
        sortWithoutMethods(num); // sorted method from Max to Min
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                secondMax = num[i + 1];
            }
        }


        return secondMax;
    }

    public static int[] sortWithoutMethods(int[] num) {

        // {2, 3, 0, -1, 5, 9, 6} outer loop
        // {2, 3, 0, -1, 5, 9, 6} inner loop

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {

                if (num[i] > num[j]) {

                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;

                    // if this condition is true ==> Swap the value of with the value of j
                    // how we can swap two number:
                    /*
                    int temp = num[i]
                    num[i] =num[j] ==> you will lose the value of num[i]
                    num[j] = temp
                     */
                    // first using extra container
                    // a=5 and b=7
                    /*
                     a = a + b; a = 12
                     b = a - b; b = 5
                     a = a - b; a = 7
                     */

                }

            }
        }
        return num;
    }


}
