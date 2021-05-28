package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;

public class ListMethods_V2 {
        public static void main(String[] args) {
            System.out.println(getDays());
            System.out.println("getDays().size() = " + getDays().size());
            System.out.println("getDays().get(0) = " + getDays().get(0));
            List<String> dayNames = getDays();
            System.out.println("dayNames = " + dayNames);
            dayNames.add("java day");
            //removeIf method - java 8 -> accepts lambda - and easy to remove without loop
            dayNames.removeIf(d -> d.length() == 6);
            System.out.println("dayNames after removeIf = " + dayNames);
        }

        public static List<String> getDays() {
            //List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday"));
            List<String> days = new ArrayList<>();
            days.add("Monday"); days.add("Tuesday"); days.add("Wednesday"); days.add("Thursday");
            days.add("Friday"); days.add("Saturday"); days.add("Sunday");
            return days;
        }
    }


