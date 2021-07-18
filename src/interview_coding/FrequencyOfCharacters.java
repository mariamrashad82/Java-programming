package interview_coding;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
     frequencyChar("TAABBBEEEEDD");
    }
    public static void frequencyChar(String str){
        String expectedResult="";
        int j = 0;
        while (j<str.length()){
            int count = 0;
            for(int i =0; i<str.length();i++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            expectedResult +=str.charAt(j)+""+count;
            str = str.replace(""+str.charAt(j),"");

        }
        System.out.println(expectedResult);



               }



}



