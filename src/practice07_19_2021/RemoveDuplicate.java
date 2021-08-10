package practice07_19_2021;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicateChar("AAABBBCCCDD") );
    }
    /*
    Create a method that will accept a String and returns a String with the duplicate instances of characters removed

    Ex:
        Input: "AAABBBCCCD"
        Output: ABCD
*/
    public static String removeDuplicateChar(String str){
        // set not allow to duplicate
        Set<String> set = new HashSet<>(Arrays.asList(str .split("")));
      //  return set.toString();
     //   return set.toString().replace("[","").replace("]","").replace(",","");
        return String.join("",set);
    }

}
