package interview_coding;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_List {
     /*
    * Create a method that will accept a String and returns a String with the duplicate instances of characters removed
Ex:
    Input: "AAABBBCCCD"
    Output: ABCD
    *
    * loop through each char I will compare with each other char in the String
    *
     */


    public static String removeDuplicateChars (String str){

        Set<String> set = new LinkedHashSet<>(Arrays.asList(str.split("")));
//        return set.toString().replace("[", "").replace("]", "").replace(", ", "");
        return String.join("", set);
    }


    public static void main(String[] args) {

        System.out.println(removeDuplicateChars("AAABBBCCCD"));


    }

}
