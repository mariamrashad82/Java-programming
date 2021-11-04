package interview_coding;

public class ReverseForLoop {
    public static void main(String[] args) {
        System.out.println(reverseString("God is love"));
    }
        public static String reverseString(String str) {
        String reverse= "";
            for(int i = str.length()-1; i >=0; i--) {
                reverse += str.charAt(i); }
            return reverse;
        }

    }

