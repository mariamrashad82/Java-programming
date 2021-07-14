package day62_collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> nums = new Vector<>();
        nums.add(45);
        nums.add(88);
        nums.add(55);
        nums.add(99);
        nums.add(100);
        System.out.println("nums = "+ nums);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("index 1 = " + nums.get(1));
        System.out.println("index 3 = " + nums.get(3));


        List<String> states = new Vector<>();
        states.add("VA");
        states.add("DC");
        states.add("CO");
        states.add("IL");
        states.add("MD");
        states.add("TX");
        states.add("CL");
        states.add("FL");

        System.out.println(states);//Vector is synchronized


    }
}
