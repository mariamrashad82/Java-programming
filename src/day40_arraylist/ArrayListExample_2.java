package day40_arraylist;
import java.util.*;
public class ArrayListExample_2 {



    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
       // nums.add("java");// Error
        System.out.println("size = " + nums.size());
        //reading from arraylist
        System.out.println("index 0 = " + nums.get(0));
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 2 = " + nums.get(2));
       // System.out.println( nums.get(3));index out of exception
        System.out.print(nums);
        nums.remove(1);//remove element at index 1
        System.out.print(" \n " + nums);


    }
}
