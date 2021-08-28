package interview_coding;

public class FindAllSubstring {
    public static void main(String[] args) {
        String word = "abc";
        /*
        a
        ab
        abc
        bc
         */
        printAllSubstring(word);
    }

    public static void printAllSubstring (String str){
        String sub = "";

        for (int i = 0; i <= str.length(); i++) {

            for (int j = i+1; j <= str.length(); j++) { // length = 3
                sub = str.substring(i, j);
                // (0,1) (0,2) (0,3)
                // (1,2) (1,3)
                // (3)
                System.out.println(sub);
            }
        }
    }

}
