package mariam_practice;

public class loopCivic {
    public static void main(String[] args) {
        String word = "civic";
        for(int i = 0 ; i < word.length()/2 ; i ++){
            if(word.charAt(0)== word.charAt(word.length()-1)){
                System.out.println(word + " is present");
                break;
            }else{
                System.out.println(word +  " is not present");
                break;
            }

        }
    }
}
