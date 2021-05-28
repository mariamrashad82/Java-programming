package day18_condition_practice_string_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int num = 5;
        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is zero");

        }
    }
}