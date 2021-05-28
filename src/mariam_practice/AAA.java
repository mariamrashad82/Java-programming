package mariam_practice;

public class AAA {
    public static void main(String[] args) {

        //Biggest substring of matching characters Given a String find the biggest substring
        // of chars that match and print it.Ex: aaabbbcccccddddeeOutput: ccccc

        String word = "aaabbbcccccddddee";
        int bigest = 0;
        int num = 1;
        char bigestChar = ' ';

        for (int i = 0; i < word.length() - 1; i++) {

            if (word.charAt(i) == word.charAt(i + 1)) {
                num++;
            } else{
                if (bigest <= num - 1) {
                    bigest = num;
                    bigestChar = word.charAt(i);
                }
                 num =1;
            }
        }
                for (int i = 0; i < bigest; i++) {
                  System.out.print(bigestChar);
        }
    }
}




        //System.out.println("bigest : " +biggest);
//if(list.substring(i, i+5).equals("jes") || list.substring(i, i + 5).equals("jes")) {
//                    System.out.println("jes is found");





