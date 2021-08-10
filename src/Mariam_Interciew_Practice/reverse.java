package Mariam_Interciew_Practice;

public class reverse {
    /*
    Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
            EX: ("apple banana kiwi") -> "kiwi banana apple"
                  ("orange")  -> "orange"

Message #part2-group16

     */
    public static void main(String[] args) {
       reverse("apple banana kiwi");
    }

    public static void reverse(String str){
        String[]word = str.split(" ");
        for(int i = word.length-1;i>=0;i-- ){
            System.out.print(word[i] +" ");


        }
    }
}
