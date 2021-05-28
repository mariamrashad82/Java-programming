package MariamWrapper;

public class Wrapper_2 {
    public static void main(String[] args) {
        System.out.println(Integer.max(40,60));
        System.out.println(Integer.min(10,67));
        System.out.println(Integer.sum(4,6));

        System.out.println("min int = " + Integer.MIN_VALUE);
        System.out.println("max int = " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.5, 7665.3));
        System.out.println("Min Double = " + Double.MIN_VALUE);
        System.out.println("Max Double = " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,55));

        System.out.println(Character.isDigit('8'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("yes");
        }
        String words = "JaVa Is Fun";
        for(int i = 0 ; i < words.length(); i++){
            if(Character.isUpperCase(words.charAt(i))){
                System.out.println(words.charAt(i));
                System.out.println();

            }
        }
        System.out.println(Character.getNumericValue(100));
        System.out.println("Min Double : " + Double.MIN_VALUE);
        System.out.println("Max Double : " + Double.MAX_VALUE);


    }
}
