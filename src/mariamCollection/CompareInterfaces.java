package mariamCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareInterfaces {
    public static void main(String[] args) {
        List<String> family = new ArrayList<>();
        family.add("samir");
        family.add("mariam");
        family.add("Marvi");
        family.add("Emmanuel");
        System.out.println(family);
        Collections.sort(family);
        System.out.println("family = " + family);
        Collections.reverse(family);
        System.out.println("familyReverse = " + family);
    }
}
