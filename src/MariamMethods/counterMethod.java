package MariamMethods;
import java.util.*;
public class counterMethod {
    public static void main(String[] args) {
        count(5);
        count(2);
        printAge(1982);
        int num2 = 100;
        count(num2);
        String word="love";
        count(word.length());


    }
    public static void count(int num){

        for (int i =0 ; i <= num ; i++){
            System.out.print(i + " + ");
        }
        System.out.println();

    }
    public static void printAge(int birthday){
        int year = 2021;
        int age = year - birthday;
        System.out.println(" My age is : " + age);
    }

}
