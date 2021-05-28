package day41_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(120); nums.add(3);nums.add(1);
        System.out.println("Before sort " + nums);
        Collections.sort(nums);
        System.out.println("After sorting " + nums);

    }
}
