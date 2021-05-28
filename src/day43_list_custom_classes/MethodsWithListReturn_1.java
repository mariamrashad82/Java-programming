package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

//get Integer List
//return list <Integer>
//loop from 0_1000_000

public class MethodsWithListReturn_1 {
    public static void main(String[] args) {

        long start = System.nanoTime();
        List<Integer> millionNum = List();
        System.out.println(millionNum.toString());
        long end = System.nanoTime();
        double listSecond = (end-start)/1_000_000_000.0;
        System.out.println("listSecond = " + listSecond);
        System.out.println("Array list time = " +( start-end));

        long st = System.nanoTime();
        int[]arr = getIntegerArray();
        long en = System.nanoTime();
        double second = (en - st)/  1_000_000_000.0;
        System.out.println("Array time = "+(st - en));
        System.out.println("second = " + second);



       // System.out.println(millionNum);
       // int[]arr = getIntegerArray();
       // System.out.println(arr);


    }

    public static ArrayList<Integer> List() {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);
        }
        return nums;
    }


    // public static List<Integer> nums(){
    //   List<Integer> list = new ArrayList<>();
    // for (int i = 0; i <= 1000_000 ; i++) {
    //    list.add(i);

    //   }
    // return list;
    //  }

    /**
     * get integer array
     * no param
     * return int[]
     * Loop from 0 - 1000_000
     *  and add to int[] then return it
     */
    public static int [] getIntegerArray(){

        int[] nums = new int[1_000_0001];
        //loop and assign number
        for(int i = 0;i<=1_000_000 ; i++){
            nums[i]=i;
        }
        return nums;
    }

}