package mariamCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Collection1 {
    public static void main(String[] args) {
        java.util.Collection<Integer> coll = new ArrayList<>();
        coll.add(33);
        coll.add(22);
        coll.add(88);
        System.out.println(coll);
        coll.addAll(Arrays.asList(33,5,77,99,55));
        System.out.println(coll);
        System.out.println("coll.size() = " + coll.size());
        System.out.println("coll.isEmpty() = " + coll.isEmpty());
        coll.remove(77);
        System.out.println("coll = " + coll);
        System.out.println("coll.contains(99) = " + coll.contains(99));
        System.out.println("coll.contains(Arrays.asList(33,22,88,33,5,99,55)) = " + coll.containsAll(Arrays.asList(33, 22, 88, 33, 5, 99, 55)));
        coll.removeAll(Arrays.asList(33, 22, 88, 33, 5, 99, 55));
        System.out.println("coll = " + coll);
        coll.retainAll(Arrays.asList(33, 22, 88, 33, 5, 99, 55));
        System.out.println("coll = " + coll);
    }
}
