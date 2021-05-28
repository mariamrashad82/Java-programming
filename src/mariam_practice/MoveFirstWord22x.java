package mariam_practice;

public class MoveFirstWord22x {
    public static void main(String[] args) {
        String sentence = "java is a fun language";
       String start = sentence.substring(0,sentence.indexOf(" ")) ;



       System.out.println(sentence.substring(sentence.indexOf(" ")+1) + " " + start );




    }
}