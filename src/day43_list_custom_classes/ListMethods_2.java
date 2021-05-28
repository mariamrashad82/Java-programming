package day43_list_custom_classes;

import java.util.*;

public class ListMethods_2 {
    public static void main(String[] args) {

        List<String> dayNames = getDays();
        System.out.println(getDays());
        System.out.println("get days () . get size () " + getDays().size());
        System.out.println("get days () . get size () " + getDays().get(0));
        System.out.println("dayNames = " + dayNames);
        dayNames.add("Java days");
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after remove if = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer>nums = getRandomList(100);
        System.out.println("nums size = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);// remove random less than 90
        System.out.println("remove Random less than 90  = " + nums);

    }

    public static List<String> getDays() {
        //List<String> days = new ArrayList<>(Arrays.asList("Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday"));
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        return days;

    }

    /**
      get random list
      param : int size
      return List<Integer>
      generate random numbers (0-100) the count of size ,and assign to list return
     getRandomList(3) ->43,12,54
     getRandomList(2)-> 1,4
     */

        public static List<Integer> getRandomList(int size){
            Random random2 = new Random();
            List<Integer> nums =new  ArrayList<>();
            for(int i = 1 ; i <= size ; i++){
              //  int n = random2.nextInt(100);
              //  if(!nums.contains(n)){
               //     nums.add(n);
                // }
                nums.add(random2.nextInt(100));

            }
            return nums;
        }



        }

