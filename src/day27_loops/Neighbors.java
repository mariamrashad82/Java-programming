package day27_loops;

public class Neighbors {
    public static void main(String[] args) {
        String word = "jaavva";
        for(int index = 0 ; index < word.length()-1 ; index++){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index + 1));// index +1 (print char and the next one)
            if(word.charAt(index) == word.charAt(index+1)){
                System.out.println("beep - " + word.charAt(index));
            }
        }
    }
}