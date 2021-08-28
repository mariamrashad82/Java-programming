package interview_coding;

public class MultipleWordArray {


    public static void main(String[] args) {
        /*
        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”
         */
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";
        String[] arrWords = words.split(", ");

        for (String eachWord : arrWords) {
            if (eachWord.contains(" ")) {
                System.out.println(eachWord);
            }
        }

    }
}
