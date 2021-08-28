package interview_coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDup {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 9, 0, -2, -7, 2, 5, 9};
        System.out.println("(removeDuplicate2(numbers)) = " + (removeDuplicate2(numbers)));

    }

    public static Set<Integer> removeDuplicate2(int[] nums) {
        // [3, 5, 9, 0, -2, -7, 2, 6, 5]

        Set<Integer> set = new HashSet<>();
        // et<Integer> set =  new HashSet(Arrays.asList(Arrays.toString(nums)));
//        System.out.println("set.size() = " + set.size());
        for (int each : nums) {
            set.add(each);
        }
        return set;
    }
}
