package practice05_19_2021;

import java.util.ArrayList;
import java.util.Arrays;
 /*
    Remove Long Strings
        This method will accept an ArrayList of Strings and an int. Remove any String elements that have less characters than the given number. Return the modified ArrayList of Strings
        @param list - Given ArrayList of Strings @param int - max number of characters @return - ArrayList of Strings
        Ex: {“one,”, “two”, “three, “four”, “five”, “six”} Max number: 4
        Output: {“three, “four”, “five”
     */


public class removeLongStringArrays {
    public static void main(String[] args) {
       ArrayList<String>list = new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        System.out.println(removeLongString(list,4));
        System.out.println(removeLongString2(list,4));


    }
    public static ArrayList<String> removeLongString(ArrayList<String>list,int minlength){
        ArrayList<String>validStrings = new ArrayList<>();
        for(String word : list){
            if(word.length()>= minlength){
                validStrings.add(word);
            }

        }
        return validStrings;
    }
    public static ArrayList<String>removeLongString2 (ArrayList<String>list,int minlength){
        list.removeIf(each-> each.length()<minlength);
        return list;
    }
}
