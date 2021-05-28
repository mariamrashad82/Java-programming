package Practice03_23_2021;

public class threeStringContainsLetter {
    public static void main(String[] args) {
        String word1 = "javas";
        String word2 = "mouse";
        String word3 = "apple";
        String biggestWithA = "";
        if(word1.contains("a") && word1.length() > biggestWithA.length()){
            biggestWithA = word1;
        }
        if(word2.contains("a") && word2.length() > biggestWithA.length()){
            biggestWithA = word2;
        }
        if(word3.contains("a") && word3.length() > biggestWithA.length()){
            biggestWithA = word3;
        }
        if(biggestWithA.isEmpty()){
            System.out.println(" No words contains A");
        }else{
            System.out.println(" longest word with A : " + biggestWithA);

        }

    }
}
