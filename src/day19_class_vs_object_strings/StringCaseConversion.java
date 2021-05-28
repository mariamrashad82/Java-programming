package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "CYBER tek";
        String sentence = "java is fun";
        System.out.println( word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JESUS".toLowerCase());
        System.out.println( "jesus".toUpperCase());
        System.out.println(sentence.toUpperCase());

        word.toLowerCase();
        System.out.println(word);
        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);
        word = word.toLowerCase();
        System.out.println("word = " + word);
        System.out.println("\n \n");

        String company = "Amazon Prim";
        System.out.println( company.toUpperCase());
        System.out.println("company in upper case = " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        //change variable to upper case
        System.out.println("company = " + company);//as it is because only company
        company = company.toUpperCase();// upper case cause we add .to uppercase
        System.out.println("company = " + company);
        
        


    }
}
