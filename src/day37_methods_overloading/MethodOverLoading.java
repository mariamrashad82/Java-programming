package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum1( 1, 2);
        sum2(15,25,35);
        sum3(1.5,2.5);
        sum4(1.5,4.4,2.2);
        sum5("Love","\t"+"Java");


    }

    public static int sum1(int num1, int num2) {
        System.out.println("result Sum1 = " + (num1 + num2));
        return num1 + num2;
    }
    public static int sum2( int num1, int num2, int num3 ) {
        System.out.println("result Sum2 = " + (num1 + num2 + num3));
        return num1 + num2 + num3;

    }

    public static double sum3(double num1, double num2){
        System.out.println("result sum3 = " + (num1 + num2));
        return num1 + num2 ;

    }
    public static double sum4(double num1, double num2,double num3){
        System.out.println("result sum4 = " + (num1 + num2 + num3));
        return num1 + num2 + num3;

    }

    public static String sum5(String a, String b){
        System.out.println("Result sum5 : "+ a + b );
        return a + b;


    }
}

