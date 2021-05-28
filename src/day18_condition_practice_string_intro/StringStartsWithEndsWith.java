package day18_condition_practice_string_intro;

public class StringStartsWithEndsWith {
    public static void main(String[] args) {
        String word = "Jesus";
        System.out.println(word.startsWith("Je"));// true
        System.out.println(word.startsWith("J"));// true
        System.out.println(word.startsWith("jes"));// false
        System.out.println(word.startsWith("es "));// false
        System.out.println("\n");
        System.out.println(word.endsWith("sus"));// true
        System.out.println(word.endsWith("Jesus"));//true
        System.out.println(word.endsWith("us"));// true
        System.out.println(word.endsWith("Us"));// true
        System.out.println("\n");

        String firstName = "Roma";
        if (firstName.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")) {
            System.out.println("doctor");
        } else if (firstName.startsWith("Mrs.")) {
            System.out.println("Women");
        } else if (firstName.startsWith("Ms")) {
            System.out.println("single women");
        } else if (firstName.startsWith("Sr")) {
            System.out.println("senior");
        }else{
            System.out.println("SDET.Mariam ");
        }
    }
}