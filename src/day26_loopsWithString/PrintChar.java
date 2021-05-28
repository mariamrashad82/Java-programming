package day26_loopsWithString;

public class PrintChar {
    public static void main(String[] args) {

        String word = "jesus is love";

        for (int i = 0; i < word.length(); i++) {
            // System.out.println(i + " - " + word.charAt(i));
            System.out.println(word.charAt(i));
        }
        System.out.println();
        // Print in Reverse:

        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
            // }
            //System.out.println(word.length());

            //System.out.println();

            // System.out.println(word.charAt(0));
            //System.out.println(word.charAt(1));
            //System.out.println(word.charAt(2));
            //System.out.println(word.charAt(3));
            //System.out.println(word.charAt(0) + "" + word.charAt(1) + word.charAt(2) + word.charAt(3));
        }

    }
}



