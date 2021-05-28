package MariamMethods;

import java.util.Scanner;

public class multipleParamMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your douple number");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        showSum(n1,n2);

    }
    public static void showSum( double num1 ,double num2 ){
        double sum = num1 + num2;
        sum = num1* num2;

        System.out.println(" Sum is = "+ sum);
    }
}
