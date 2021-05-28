package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13));//12345
        System.out.println(result.substring(13,18));//12345
        System.out.println(result.substring(12,13));// :
        System.out.println(result.indexOf(":"));// 12
        int colonIndex = result.indexOf(":");
        //combine them into one statement
        System.out.println(result.substring(colonIndex +1));//12345
        System.out.println(result.substring(result.indexOf(":") + 1));//12345

        String today = "i learned [java] today";
        int start = today.indexOf("[");
        int ends = today.indexOf("]");

        System.out.println(today.substring(start+1,ends ));//java
        System.out.println(today.substring(today.indexOf("[")+1, today.indexOf("]")));//java



    }
}
