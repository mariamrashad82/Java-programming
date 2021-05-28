package day35_methods_with_param;

import java.util.Locale;

public class Counters3 {
    public static void main(String[] args) {
        count(7);
        count(5);
        count(2);
        int num2 = 999;
        count(num2);
        String word = "Wooden Spoon";
        count(word.length());
        printAge(1982);


    }

    public static void count(int num) {

        for(int i=0 ; i<=num ;i++){
            System.out.print( i + " " );
        }
        System.out.println();

    }
    public static void printAge(int birthYear) {
        int year = 2021;

        int age = year-birthYear;
            System.out.print( "birthYear : "+birthYear + " My age : " + age );
            //public static void printAge(int year){
        //int age = 2021-year;
        //        System.out.println("Birth year: "+year + " Age: " + age);
        }
}
