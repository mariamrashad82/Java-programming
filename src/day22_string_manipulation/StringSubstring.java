package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        // word.substring( startIndex,endIndex)
        //endIndex is not included
        System.out.println(word.substring(0, 4));// java
        System.out.println(word.substring(0, 7));//java is
        System.out.println(word.substring(5, 7));// is
        System.out.println(word.substring(8, 11));//fun
        // another way substring(startIndex)read from start until end90ijmn
        System.out.println(word.substring(8));//fun
        System.out.println(word.substring(5));// is fun

        String word2 = "jesus is love";
        System.out.println(word2.substring(0));
        System.out.println(word2.substring(6,8));
        System.out.println(word2.substring(9));
        if(word2.indexOf("is") >= 3){
            System.out.println(" its here");
        }





        if (word.indexOf("av") >= 1) {
            System.out.println("is present !");
        } else {
            System.out.println("not present !");
        }
    }
}