package mariam_practice;

import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******** Check Your Mass *********");
        System.out.println(" Enter Your Mass  ");
        double mass = scan.nextDouble();
        System.out.println("Enter your high");
        double high = scan.nextDouble();
        double bmi =mass / high * high;
        if(bmi < 18.5 ){
            System.out.println("Under Weight");
        }else if(bmi > 18.5 && bmi <25){
            System.out.println("Normal Weight");
        }else if(bmi > 25 && bmi < 30){
            System.out.println("Over Weight");
        }else if(bmi > 30){
            System.out.println("Obese");
        }else{
            System.out.println("Close Your Mouse");
        }


    }
}
