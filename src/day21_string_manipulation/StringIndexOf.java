package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "jesus is love";
        System.out.println(word.indexOf("j") );// 0
        System.out.println(word.indexOf("s") );// 2
        System.out.println(word.indexOf("e") );// 1
        System.out.println(word.indexOf("sus") );// 2
        System.out.println(word.indexOf("is") );// 6
        System.out.println(word.indexOf("java") );// -1 means invalid
    }
}
