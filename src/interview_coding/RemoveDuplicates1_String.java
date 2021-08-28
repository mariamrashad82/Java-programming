package interview_coding;


//Write a return method that can remove the duplicated values from String
//
//Ex:  removeDup("AAABBBCCC")  ==> ABC

public class RemoveDuplicates1_String {
    public static void main(String[] args) {
        System.out.println("remove Duplicate=" + removeDup("AAABBBCC"));
    }
    public static String removeDup(String str){
        String result ="";
        for(int i = 0 ; i < str.length();i++){
            if(!result.contains("" +str.charAt(i))){
                result +=""+str.charAt(i);
            }
        }
        return result;
    }


}
