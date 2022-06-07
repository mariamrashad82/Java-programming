package interview_coding;

public class ReverseSimple {
    public static void main(String[] args) {


        String name = "God Is Love";
        String reversed = new StringBuilder(name).reverse().toString();
        System.out.println(reversed);

   String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}
