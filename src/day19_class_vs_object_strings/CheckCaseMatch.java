package day19_class_vs_object_strings;

import java.util.Locale;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "usa";
        if (countryCode.equals(countryCode.toUpperCase())) {
            ;
            System.out.println("pass - case is correct");
        } else {
            System.out.println("fail - case is incorrect");

            String word = "java";
            String uWord = word.toUpperCase();
           // word = word.toUpperCase();
            System.out.println(word);//java
            System.out.println(uWord);//JAVA
            if(word.equals(uWord)){
                System.out.println("case match");
            }else{
                System.out.println("case not match");
            }


        }

    }
}








