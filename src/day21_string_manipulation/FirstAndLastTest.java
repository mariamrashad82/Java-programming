package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if (first == last) {
            System.out.println("Same first and last letter match ");
        } else {
            System.out.println("Same first and last letter not match ");
        }
        if(word.charAt(0) == word.charAt(2)){
            System.out.println("Same first and last letter match ");
        }else{
            System.out.println("Same first and last letter not match ");
        }
        String friend = "aghaba";
        char firstLetter = friend.charAt(0);
        int count = friend.length();
        //char lastLetter = friend.charAt(count -1);
        char lastLetter = friend.charAt(friend.length() -1);
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        if(firstLetter == lastLetter){
            System.out.println(friend + " first and last match");
        }else{
            System.out.println(friend + " first and last not match");
        }

    }
}