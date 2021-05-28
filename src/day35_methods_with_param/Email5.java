package day35_methods_with_param;

import java.util.Locale;

public class Email5 {
    public static void main(String[] args) {
        buildEmail("Mariam.Rashad","yahoo");
        buildEmail("haninsamir","yahoo");


    }
   // public static void buildEmail( String name,String domain) {
     //   String email = name + "@" + domain + ".com";
       // System.out.println(email);

       public static void buildEmail( String name,String domain) {
        name=name.replace(" ","_").toLowerCase();
        domain= domain.toLowerCase();
        String email = name + "@" + domain + ".com";
        System.out.println(email);

        }


    }



