package MariamMethods;

public class StringUtil_Methods {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty("Java"));
        String word =null;
        System.out.println(word.isEmpty());

    }
    public static boolean isNullOrEmpty(String str){
        return str==null || str.isEmpty();

    }


}
