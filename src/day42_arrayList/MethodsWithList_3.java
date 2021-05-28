package day42_arrayList;

import java.util.*;

public class MethodsWithList_3 {
    public static void main(String[] args) {
        //declare String arraylist and add value
        List<String> words = new ArrayList<>();
        words.add("java");words.add("HTML");words.add("selenium");words.add("title");
        words.add("a");words.add("input");

        printStrList(words);
        printStrList(Arrays.asList("select", "Option","br","python","SQL","api"));

        List<Integer> nums =Arrays.asList(23,54,23,455,5767,11,2,5);
         int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);


    }

        /**
         * methods name : PrintStrList
         * param: list of strings
         * return: void
         * print all values separated by space in same line
         */
        public static void printStrList(List < String > stringList) {  // shortcut control space
            for(String str :stringList){
                System.out.print( "Str = " +str + " , ");
        }
            System.out.println();
    }
    /**
     * Method:sumIntegerList
     * param:list of Integer
     * return int
     * calculate sum of integers in the list and then return
     */
    public static int sumIntegerList(List<Integer>integerList ) {
        int sum =0;
        for(int each:integerList){
            sum += each;
        }
        return sum;

    }





}