package Practice04_14_2021;

public class ArrayLongestPalindrome2 {
    public static void main(String[] args) {
        String [] words = {"java","longer word","civic","rececar","mom","ana"};
        String longestPalindrome = "";

        for(String word : words) {

            boolean isPalindrome = true;

            for(int i=0; i < word.length()/2; i++) {
                if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome && word.length() > longestPalindrome.length()){
                longestPalindrome = word;
            }

        }
    }
}
