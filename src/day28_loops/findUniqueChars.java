package day28_loops;

public class findUniqueChars {
    public static void main(String[] args) {
        String word = "javva";
        String unique ="";
        //for (int i = 0 ; i <= word.length()-1 ; i++){
        for (int i = 0 ; i < word.length(); i++){

            //if word . charAt(i)is not contains in unique
            // add to unique
            if (!unique.contains(word.charAt(i)+"")){ // we add "" to make char to string
                unique += word.charAt(i);

            }
        }
        System.out.println("unique : " + unique);


    }
}
