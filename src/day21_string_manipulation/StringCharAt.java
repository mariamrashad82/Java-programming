package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word + "-" +  word.length());

        String company = "cybertek";
        System.out.println("first letter: " + company.charAt(1));
        char first =company.charAt(0) ;
        System.out.println("first = " + first);
        char second =company.charAt(1) ;
        System.out.println("second = " + second);
        char third =company.charAt(2) ;
        System.out.println("third = " + third);
        char fourth =company.charAt(3) ;
        System.out.println("fourth = " + fourth);
        char fifth =company.charAt(4) ;
        System.out.println("fifth = " + fifth);
        char six =company.charAt(5) ;
        System.out.println("six = " + six);
        char seven =company.charAt(6) ;
        System.out.println("seven = " + seven);
        char eight =company.charAt(7) ;
        System.out.println("eight = " + eight);
        System.out.println(first+" "+second +" " +third+" " + fourth + " " + fifth+ " " + six+ " " + seven+ " "+ eight );

        String withSpaces = first+" "+second +" " +third+" " + fourth + " " + fifth+ " " + six+ " " + seven+ " "+ eight;
        System.out.println( "with Spaces : " + withSpaces);




    }
}
