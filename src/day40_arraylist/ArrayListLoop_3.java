package day40_arraylist;
import java.util.*;
public class ArrayListLoop_3 {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();
        System.out.println("nums = " + nums);
        System.out.println("size = " + nums.size());

        nums.add(34); nums.add(134); nums.add(354); nums.add(54); nums.add(37); nums.add(565);
        nums.add(3); nums.add(324); nums.add(500); nums.add(870); nums.add(390); nums.add(900);
        System.out.println("nums = " + nums);
        nums.remove(3);
        System.out.println("nums = " + nums);
       // nums.remove(88);// we cant print value IndexOutOfBoundsException

       nums.remove(new Integer(37)) ;
        System.out.println("nums* = " + nums);
        nums.remove(new Integer(4));
        System.out.print("nums* = " + nums);
        // for loop - iterate through all value and print
        System.out.println("\n");
        for(int i=0 ; i< nums.size(); i++){
            System.out.print(nums.get(i)+" ");
        }
        System.out.println("\n");
        for(int each : nums){
            System.out.print(each+ " ");
        }


    }
}
