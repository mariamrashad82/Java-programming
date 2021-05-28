package day18_condition_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 4;
        System.out.println(num % 2);
        System.out.println(num % 2 == 0);

        if (num % 2 == 0) {
            System.out.println(num + " is even");

        } else {
            System.out.println(num + " is odd");
        }
    }

}