package practice07_19_2021;

import java.util.*;

public class SortEachPart {
    public static void main(String[] args) {
        System.out.println(sortEach("CD051ACCGC011998"));
    }

    public static String sortEach(String str){
        String fixedStr = "";
        ArrayList<String> eachSub = new ArrayList<>();

        // Queue<String> eachSub = new PriorityQueue<>();

        //"DC501GCCCA098911
        // eachSub =
        // fixed =

        for(int i=0; i < str.length(); i++){

            char eachChar = str.charAt(i);
            eachSub.add("" + eachChar);
            boolean nextSubString = false;

            if(Character.isLetter(eachChar)){
                // we are a character
                if(i == str.length() -1 || !Character.isLetter(str.charAt(i + 1)))   {
                    // next char is a number, do an action
                    nextSubString = true;
                }

            } else {
                // we are a number
                if(i == str.length() -1 || !Character.isDigit(str.charAt(i + 1))){
                    // next is letter, do an action
                    nextSubString = true;
                }
            }
            // this is the action
            if(nextSubString){
                Collections.sort(eachSub);
                fixedStr += String.join("", eachSub);
                eachSub.clear();

                // with queue as eachSub, you don't need this line: Collections.sort(eachSub);
            }

        }

        return fixedStr;
    }
    }


