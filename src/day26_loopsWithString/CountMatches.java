package day26_loopsWithString;

public class CountMatches {
    public static void main(String[] args) {
        String word = "Jesus";
        char letter = 's';
        int count = 0;

        for (int j = 0; j <word.length(); j++) {
            if (word.charAt(j) == letter) {
                count++;
            }
        }
        System.out.println("there are " + count + " " + letter + "'s in " + word);
    }
}


