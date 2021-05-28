package day38_methods;

public class StringUtils3 {
    public static void main(String[] args) {

        System.out.println( "is null Empty (\" hello\") =  "  + isNullOrEmpty("hello"));
        String word = null;
       // System.out.println(word.isEmpty());

        System.out.println( "is null Empty (\" Word\") =  "  +  isNullOrEmpty(word));
         word = " ";
        System.out.println( "is null Empty (\" Word\") =  "  + isNullOrEmpty(word));
    }
    public static boolean isNullOrEmpty(String str) {
       // if (str.equals("") || str == null){
        if (str == null || str .isEmpty()){
            return true;
        } else {
            return false;
        }
    }
    }

