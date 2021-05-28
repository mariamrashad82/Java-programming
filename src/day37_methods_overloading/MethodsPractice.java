package day37_methods_overloading;

public class  MethodsPractice {
    public static void main(String[] args) {

        System.out.println(repeatString(" java ",3, '|'));
        System.out.println(repeatString(" hi ", 5 , '*'));
    }
        public static String repeatString(String word,int times,char delimiter){
        String result = "";
        for(int i = 1; i <= times ; i++){
            result += word + delimiter;

        }
        return result;
        }

    }