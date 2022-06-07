package mariamCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("samir","Mariam","Marvi","Emmanuel"));
        System.out.println("names = " + names);
        Collections.reverse(names);
        System.out.println("names = " + names);
        System.out.println("*********************************************");

        List<Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(44,55,77,22,11,99,76));
        System.out.println("num = " + num);
        Collections.sort(num);
        System.out.println("num after sort = " + num);
        Collections.reverse(num);
        System.out.println("num after reverse = " + num);






    }
}