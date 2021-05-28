package day45_oop;

public class comparingString {
    public static void main(String[] args) {
        String word1="java";
        String word2="java";
        String word3=new String("java");
        String word4=new String("java");

        System.out.println(word1==word2);//True
        System.out.println(word1==word3);//false
        System.out.println(word3==word4);//false

        System.out.println(word1.equals(word2));//true
        System.out.println(word1.equals(word3));//true
        System.out.println(word3.equals(word4));//true


    }
}
