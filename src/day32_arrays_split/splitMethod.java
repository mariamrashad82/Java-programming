package day32_arrays_split;

import java.util.Arrays;

public class splitMethod {
    public static void main(String[] args) {
                      //  1    2       3      4
        String words = "java,python,selenium,html";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("Length of array =  "  + wordsArray.length);
        System.out.println("_________________________________");

        for(String each : wordsArray){
            System.out.println(each);
        }
        System.out.println("__________________________________");
          // be carful between " " space
        String sentence = "Today I am Coding Java Arrays" ;
        String[] sentenceArrays = sentence.split(" ");
        System.out.println("first word : " + sentenceArrays[0]);
        System.out.println("first word : " + sentence.split(" ")[0]);

        System.out.println(Arrays.toString(sentenceArrays));
        System.out.println("Number of words in sentence  =  "  + sentenceArrays.length);
        System.out.println("__________________________________");
        for( String each : sentenceArrays){
            System.out.println(each);
        }
    }
}
