package mariam_practice;

import java.util.Arrays;

public class multipleWords {
    public static void main(String[] args) {
        //Multiple WordsGivenaStringofwords that are separate by commas.
        // Find and print any words that have more than one wordExampleInput:
        // "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer”Output:
        // wooden spoonstrash candish washer

                //        0      1               2      3     4     5    6     7         8       9
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can,fridge,dish washer";
        String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));
            System.out.println(wordsArray[1]);
            System.out.println(wordsArray[7]);
            System.out.println(wordsArray[9]);
        }
    }
