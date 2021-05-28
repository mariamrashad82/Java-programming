package day38_methods;

public class StringUtilTest4 {
    public static void main(String[] args) {
        String userName = " ";
        if(StringUtilsV3.isNullOrEmpty(userName)){
            System.out.println("Fail : User name can not be null or empty");
        }
        System.out.println( "is Palindrome (civic)" + StringUtilsV3.isPalindrome("Civic"));
        System.out.println( "is Palindrome (kayak)" + StringUtilsV3.isPalindrome("Kayak"));
        System.out.println("is Palindrome (cybertek)" + StringUtilsV3.isPalindrome("cybertek"));

        String word = "Sunday";
        String revWord = StringUtilsV3.reverse(word);
        System.out.println("Word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtilsV3.reverse(word));
        }
    }

