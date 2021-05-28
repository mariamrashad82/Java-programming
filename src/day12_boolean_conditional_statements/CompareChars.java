package day12_boolean_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';//65
        char letter2 = 'J';//74
        System.out.println("are both equal = " + (letter1 == letter2));
        System.out.println("is greater =  " + (letter1 > letter2));
        System.out.println("is less = " +(letter1 <  letter2));
        System.out.println("\n");

        char grade = 'A';
        boolean pass = grade <= 'D';
        System.out.println("did you pass the exam ?  - " + pass);


    }
}
