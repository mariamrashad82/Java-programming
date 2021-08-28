package interview_coding;

public class PrintAllSubstring {
    public static void main(String[] args) {
        String word = "ABCD";
        printAllSubstring(word);


    }

    public static void printAllSubstring(String str) {

        String sub = "";

        // ABC
        // 012
        // (0,1) --> A
        // (0,2) --> AB
        // (0,3) --> ABC
        // (1,2) --> B
        // (1,3) --> BC
        // (2,3) --> C


        for (int i = 0; i < str.length(); i++) { // length = 3

            for (int j = i + 1; j <= str.length(); j++) {
                sub = str.substring(i, j);
                System.out.println("sub = " + sub);
            }
        }
    }
}
