package MariamMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class group_2 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(-2);
        numbers.remove(1);
        numbers.add(1,25);
        numbers.add(numbers.remove(0));
        System.out.println(numbers);
    }
}
