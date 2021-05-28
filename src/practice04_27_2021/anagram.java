package practice04_27_2021;
import java.util.*;
public class anagram {
    public static void main(String[] args) {

            System.out.println(isAnagram("abc", "cba"));
        }

        // 1) toCharArray -> sort -> equal ?
        // 2) loop through one String -> remove the char that you iterate through
        // in the other String -> if empty the 2nd String is empty?

        public static boolean isAnagram (String one, String two){

            if(one.length() != two.length()) {
                return false;
            }
            one = one.toLowerCase();
            two = two.toLowerCase();

            int [] count = new int[26];

            // listen -> l + 1, i + 1, s + 1
            // silent -> s - 1, i - 1, etc

            // a -> 0, b = 1, c = 2
            // z -> 25

            for (int i=0; i < one.length(); i++) {

                char letterFromOne = one.charAt(i); // b -> 98 - 97 = 1
                char letterFromTwo = two.charAt(i);

                count[letterFromOne - 97] = count[letterFromOne - 97] + 1;
                count[letterFromTwo - 97] = count[letterFromTwo - 97] - 1;

                // System.out.println(Arrays.toString(count));
            }

            return Arrays.equals(count, new int[26]);
        }



    }

