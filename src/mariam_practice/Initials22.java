package mariam_practice;

import java.util.Locale;

public class Initials22 {
    public static void main(String[] args) {
        String FullName = "james Bond";
       String initials = "" +  FullName.charAt(0) + FullName.charAt(6);
        System.out.println("initials :" +  initials.toUpperCase());
    }
}
