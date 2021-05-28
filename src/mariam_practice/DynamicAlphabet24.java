package mariam_practice;
import java.util.*;
public class DynamicAlphabet24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Is the letter Upper or lower?");

        String check= scan.next();
        if(check.equalsIgnoreCase("upper")){
            char start ='A';
            while(start<='Z'){
                System.out.print(start++ + " ");}


        }else if(check.equalsIgnoreCase("lower")) {
            char start = 'a';
            while (start <= 'z') {
                System.out.print(start++ + " ");
            }


        }










        //char letter = 'A';
       // while (letter <= 'Z') {
            // System.out.println("letter = " + letter++);
           // System.out.println("letter++ = " + letter++);


        //System.out.println();
       // char letter2 = 'z';
        //while (letter2 >= 'a') {
            // System.out.println("letter = " + letter++);
           // System.out.print("(" + letter2-- + ")");








       //• Write a program that will ask ‘upper’ or ‘lower’
        //• If it is upper: print the alphabet in all uppercase letter from A to Z
        //• If it is lower: print the alphabet in all uppercase letter from a to z
        //- Challenge: Also ask if they want to show the alphabet in ascending or
        //order descending
        //- Ascending: A – Z or a – z
        //- Descending: Z – A or z – a
    }
}