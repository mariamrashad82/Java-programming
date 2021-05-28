package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods_V3 {

        public static void main(String[] args) {

            List<String> dayNames = getDays();  //better to add in a variable cause later you can add to itt later etc.

            System.out.println("dayNames = " + dayNames);
            System.out.println(dayNames.size());
            System.out.println(dayNames.get(1));    //1 is index in arrayList

//        System.out.println(getDays());
//        System.out.println("getDays().size() = " + getDays().size());
//        System.out.println("getDays().get(5) = " + getDays().get(5));

            dayNames.add("java day");

            //remove the ones from the list witch have 6 characters

            //we can do with loop and if

            //or we can do
            //removeIf method - java 8 -> accepts lambda - and easy to remove without loop


            dayNames.removeIf(d -> d.length() == 6);
            System.out.println("dayNames after removeIf = " + dayNames);

            System.out.println(getRandomList(10));

        }

        public static List<String> getDays() {
            List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));


            return days;
        }

        /**
         * getRandomList
         * param: int size
         * return list<Integer>
         *     generate random numbers the counts of size(0-100), and assign to List than return
         */

        public static List<Integer> getRandomList(int size) {
            Random random = new Random();//to generate random numbers with 0-100
            List<Integer> nums = new ArrayList<>();

            for (int i = 1; i <= size; i ++) {
                nums.add(random.nextInt(20));//generate random number from 0-100 and add to list

            }
            return nums;
        }
    }


