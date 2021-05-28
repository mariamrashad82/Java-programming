package day23_string_manipulation_while_loop;

import java.util.Locale;

public class chainingStringMethod {
    public static void main(String[] args) {
        String word = "woo den sp oon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" " , "").toUpperCase());

        String city = "cairo";
        System.out.println(city.substring(0,1).toUpperCase() + city.substring(1).toUpperCase());
        String capitalized = (city.substring(0,1).toUpperCase() + city.substring(1).toUpperCase());
        System.out.println("capitalized = " + capitalized);
        
        

    }
}
