package Practice04_06_2021;

public class LongestSubstringCc {
    public static void main(String[] args) {
        String words = "sssbbbcccccccddddee";
        String longestLetters = "";
        String temp = "";
        for(int i=0 ; i< words.length()-1; i++){
            temp+= words.charAt(i);
            if(words.charAt(i) != words.charAt(i + 1)){

                if(temp.length() > longestLetters.length()) {
                    longestLetters = temp;
                }

                temp = "";

            }
        }

        System.out.println("Longest substring: "+ longestLetters);




    }
    }

