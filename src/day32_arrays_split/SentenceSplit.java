package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] wordsArrays = sentence.split(" ");
        System.out.println("1st word = " + wordsArrays[0]);
        System.out.println("2nd word = " + wordsArrays[1]);
        System.out.println("3rd word = " + wordsArrays[2]);
        //  System.out.println("4th word = " + wordsArrays[3]); out of bounds


        System.out.println("___________________________________");
        for (String W : wordsArrays) {
            System.out.println("W = " + W);

        }
        System.out.println("________________________________");
        //     0     1         2       3      4
        String googleResult = "About 1,810,000 resultsArrays (0.68 seconds)";
        String[] resultsArrays = googleResult.split(" ");
        System.out.println("Count of resultsArrays = " + resultsArrays[1]);
        System.out.println("Second = " + resultsArrays[3]);
        System.out.println("Second = " + resultsArrays[3].replace("(", ""));//or
        System.out.println("Second = " + resultsArrays[3].substring(1));
    }
}





