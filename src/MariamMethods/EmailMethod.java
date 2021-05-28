package MariamMethods;

import java.util.Locale;

public class EmailMethod {
    public static void main(String[] args) {
        email("mariam.rashad","yahoo");

    }
    public static void email(String name,String domain){
        String email = name + " @ " +domain+ ".com";
        System.out.println(email);
        name = name.replace(".","_").toLowerCase();
         email = name + " @ " +domain+ ".com";
        System.out.println(email);
    }
}
