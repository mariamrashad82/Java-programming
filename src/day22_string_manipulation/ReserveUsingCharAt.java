package day22_string_manipulation;

public class ReserveUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
        System.out.println("" +word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));//avaj
        System.out.println(word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));// 418
        System.out.println(word.charAt(0)+ "" +word.charAt(1) + "" +word.charAt(2) + "" +word.charAt(3));//java
        System.out.println(word.toUpperCase());//JAVA
        String reversed ="" +word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("reversed = " + reversed);
        if(word.equalsIgnoreCase(reversed)){ // java != avaj
            System.out.println("palindrome word");
        }else{
            System.out.println("Not palindrome word");
        }




    }
}
