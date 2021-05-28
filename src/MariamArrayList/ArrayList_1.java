package MariamArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayList_1 {
    public static void main(String[] args) {
        List<Character>letters= new ArrayList<>();
        letters.addAll(Arrays.asList('j','e','s','u','s','l','o','v','e','s','m','e'));
        System.out.println("size : "+ letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println("After reverse letters  = " + letters);
        System.out.println(Collections.frequency(letters,'s'));
        int eCount = Collections.frequency(letters,'e');
        System.out.println("eCount = " + eCount);
        System.out.println("max letters = " + Collections.max(letters));
        System.out.println("min letter =  " + Collections.min(letters));
        Collections.replaceAll(letters,'o','u');
        System.out.println("After replace : " + letters);
        Collections.sort(letters);
        System.out.println("after sorted : " + letters);


    }
}
