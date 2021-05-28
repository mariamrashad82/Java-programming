package day40_arraylist;

import java.util.*;

public class RawArrayList_1 {
    public static void main(String[] args) {
        // Declare raw arraylist
        ArrayList list1 =new ArrayList();
        List list2 = new ArrayList();
        //add value
        list1.add("java");
        list1.add("coffe");
        list1.add("apples");
        list1.add(356);
        list1.add(76.5);
        list1.add(true);
        list1.add("wooden spoon");
        System.out.println("list1 = " + list1);
        System.out.println("size = " +list1.size());
    }
}
