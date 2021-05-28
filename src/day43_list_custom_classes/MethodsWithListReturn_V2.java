package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn_V2 {
    public static void main(String[] args) {
        List<Integer> mlnNums = getIntegerList();//returns ready ArrayList object. no need new Arra..
                System.out.println(mlnNums);
            }
            /**
             * getIntegerList
             * No params
             * return List<Integer>
             *    Loop from 0 - 1000_000
             *    and add to arraylist then return it
             */
            public static List<Integer> getIntegerList() {
                List<Integer> nums = new ArrayList<>();
                for(int i = 0; i <= 1_000_000; i++) {
                    nums.add(i);
                }
                return nums;
            }

            /**
             * getIntegerArray
             * No params
             * return int[]
             *    Loop from 0 - 1000_000
             *    and add to int[] then return it
             */

        }


