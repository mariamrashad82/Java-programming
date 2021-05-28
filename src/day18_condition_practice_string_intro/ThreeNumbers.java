package day18_condition_practice_string_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 100;
        int num3 = 1000;
        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " Is largest");

        }else if(num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " Is Largest");

        }else{
            System.out.println(num3 + " Is Largest");
        }

    }
}
