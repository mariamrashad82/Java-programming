package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
     String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("Java = " + word.length() + " character");
        System.out.println("wooden spoon".length());
        String firstName = "Mariam";
        System.out.println(firstName+ " - " + firstName.length() + " character\n");

        int count = firstName.length();
        System.out.println("count = " + count + "\n\n");


        // if statement:
        // when password is at least 6 characters:
        // print : valid password
        // else : short password
        String password = "many";
        if (password.length() >= 6){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password , password must be at least 6 characters");
        }



    }
}
