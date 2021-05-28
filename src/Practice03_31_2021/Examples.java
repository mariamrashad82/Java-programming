package Practice03_31_2021;

public class Examples {
    public static void main(String[] args) {
        // +=

        // number
        // += shorthand for addition
        // number = number + 5  <==>  number += 5;

        // String
        // += concatenation
        // str = str + "new word"; <==> str += "new word";

        String str ="java";
        char letter = 'a';
        int count = 0;

        for(int i =0; i < str.length(); i++) {
            if(str.charAt(i) == letter) {
                count++;
            }
        }

        System.out.println(letter + " was found " + count + " times in " + str);
    }
}
