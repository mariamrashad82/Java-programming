package interview_coding;

public class StringPalindrome {


    // isPal("anna")   -> true
    // isPal("civic")  -> true
    // isPal("apple")  -> false
    // isPal("level")  -> true

    public static void main(String[] args) {

        String word = "civic";
        boolean isPalindrome = true;
        // Q: What if your String has a million characters

        for (int i = 0; i < word.length() / 2; i++) {

            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);


    }
}