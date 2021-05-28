package day18_condition_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String today_class = "Java";
        if(today_class.equals("Java"))
            System.out.println("Java is fun");
        else
            System.out.println(today_class + "it is not fun");

        int a = 10;
        if (a == 1)
            System.out.println("a is 1");
            System.out.println("1 is a");

    }
}
