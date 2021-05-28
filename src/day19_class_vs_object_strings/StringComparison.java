package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Chicago";
        // equals()method-case sensitive
        System.out.println(city.equals("Chicago"));
        System.out.println(city.equals("chicago"));
        System.out.println(city.equals("Chicago "));
        //equals ignore case() method-case insensitive comparison
        System.out.println(city.equalsIgnoreCase("chicago"));
        System.out.println(city.equalsIgnoreCase("CHICAGO"));
        System.out.println(city.equalsIgnoreCase("ChicAgo"));
        System.out.println(city.equalsIgnoreCase("ChiicAgo"));
        System.out.println(city.equalsIgnoreCase("Chic Ago"));


        if(city.equals("chicago")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");
        }
        if(city.equalsIgnoreCase("chicago")) {
            System.out.println("equals() true");
        }else{
            System.out.println("equals() false");

        }
    }
}
