package day38_methods;

import java.util.Locale;
import static day38_methods.StringUtilsV3.*;

public class StringUtilsV3 {
    public static void main(String[] args) {


        System.out.println("isNullOrEmpty = " + isNullOrEmpty(""));
        String word ="";
        System.out.println(word.isEmpty());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word = "";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));



    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
//        if(str == null || str.isEmpty()) {
//            return true;
//        }
//        return false;
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;

            }
        }
        return true;
    }
    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0 ; i--) {
            reverse +=str.charAt(i);
        }
        return reverse;
    }
    }



