package mariam_practice;

public class StringMiddleChar22 {
    public static void main(String[] args) {
        String word = "elephant";
        //int even = (word.length());
        //System.out.println(even);
        //if(word.length()==even){
        System.out.println(word.length());
        if(word.length() % 2 == 0){
            System.out.println("the middle characters : "+ (word.substring(3,5)));

        }

    }
}