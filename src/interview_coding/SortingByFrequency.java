package interview_coding;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingByFrequency {
    // tomorrow  ==> ooorrtmw

    public static void main(String[] args) {
        String str = "tomorrow";

        System.out.println("sortByFrequency(str) = " + sortByFrequency(str));
    }

    public static String  sortByFrequency(String str){
        List<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(""+str.charAt(i));
        }
        // [ o, o, o, r, r, t, m, w ]
        // [ o, o, o, r, r, t, m, w ]



        // index 3
        // index 5

        // index i = t
        // index i+1 = o

        // ( 1 < 1 ) ==> swap t with o
        // I want to check each index of my outer loop with all indexes in inner loop:
        // if the frequency of index i is less than the frequency of index j ==>
        // swap the index i with index j

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1 ; j < list.size(); j++) {
                if (Collections.frequency(list, list.get(i)) <
                        Collections.frequency(list, list.get(j))){
                    // first step
                    String temp = list.get(i);
                    // second step:
                    list.set(i , list.get(j)); // change the value of index i with the new value of index j
                    // third step:
                    list.set(j, temp);
                }
            }
        }
        String result = "";

        result = String.join(" ", list);

        // 1. temp = index i
        // 2. index i = index i+1
        // 3. index i+1 = temp



        return result;
    }

}
