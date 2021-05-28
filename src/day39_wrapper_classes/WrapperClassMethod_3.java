package day39_wrapper_classes;

public class WrapperClassMethod_3 {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,40));
        System.out.println(Integer.min(5,2));
        System.out.println("min int : "+ Integer.MIN_VALUE);
        System.out.println("max int : "  +Integer.MAX_VALUE);

        System.out.println(Double.max(234.5,323.6));
        System.out.println("MIN Double : " + Double.MIN_VALUE);
        System.out.println("Max Double : " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,55));

        System.out.println(Character.isDigit('8'));//T
        System.out.println(Character.isDigit('V'));// F
        System.out.println(Character.isAlphabetic('Q'));// T
        System.out.println(Character.isLetter('t'));// T
        System.out.println(Character.isLetter('6'));// F
        System.out.println(Character.isLowerCase('f'));// T
        System.out.println(Character.isUpperCase('F'));// T

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println(" it is uppercase");
        }
        String word = "JaVa Is Fun";
        for(int i = 0 ; i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
                System.out.println();
            }


            }
        System.out.println(Character.getNumericValue(100));// 13
        System.out.println("MIN Double : " + Double.MIN_VALUE);
        System.out.println("Max Double : " + Double.MAX_VALUE);


        }
    }

