package interview_coding;

public class FindTheUnique_String {
    public static void main(String[] args) {
        String word = "javva";
        int count = 0;
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == word.charAt(i)){
                    count++;
                }
            }
            if(count == 1){
                result += word.charAt(i)+"";
            }
        }
        System.out.println(result);
    }
}