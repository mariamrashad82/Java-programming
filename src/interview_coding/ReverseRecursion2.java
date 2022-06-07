package interview_coding;

public class ReverseRecursion2 {
    public static void main(String[] args) {

    }

        public static String reverse (String input){
            if (input.isEmpty()) {
                System.out.println("String is empty now");
                return input;
            }
            return reverse(input.substring(1)) + input.charAt(0);
        }

    }
