package interview_coding;

public class ReverseStringRecursion {
    public static void main(String[] args) {

            String str = "Java is fun";
            String reversed = reverseString(str);
            System.out.println("The reversed string is: " + reversed);
        }

        public static String reverseString(String str)
        {
            if (str.isEmpty())
                return str;
            //Calling Function Recursively
            return reverseString(str.substring(1)) + str.charAt(0);
        }
    }

