package interview_coding;

public class RevSenWithArray {
    public static void main(String[] args) {
        // Scanner scan= new Scanner(System.in);
        // System.out.println(" ****Enter your sentence****");
        //String sentence = scan.next();
        String reversed = " ";
        String sentence = "java is today ";
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            //System.out.println(words[i] + " ") ;
            reversed += words[i] + " ";
        }
        System.out.println("sentence  : " + sentence);
        System.out.println("reversed  : " + reversed.trim());


    }
}