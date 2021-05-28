package Practice05_03_2021;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraylistFourOrLess {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "java", "tree", "cat", "animal", "shortcut"));

        ArrayList<String> list2 = new ArrayList<>();

        for(String each : list){

            if(each.length() <= 4) {
                list2.add(each);
            }

        }


    }
}
