package mariamCollection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Double> lst = new LinkedList<>();
        System.out.println("lst.add(2d) = " + lst.add(25d));
        lst.addAll(Arrays.asList(33d,55d,66d,88d));
        System.out.println("lst = " + lst);
        List<Double> lst2 = new LinkedList<>(Arrays.asList(33d,55d,66d,88d));
        System.out.println("lst2 = " + lst2);
        System.out.println("lst.get(1) = " + lst.get(1));
        lst.add(1,44d);
        System.out.println("lst = " + lst);
        lst.replaceAll(each-> each+5);
        System.out.println("lst = " + lst);
        lst.addAll(0,Arrays.asList(20d,25d));
        System.out.println("lst = " + lst);
        lst.sort(null);
        System.out.println("lst = " + lst);
    }
}
