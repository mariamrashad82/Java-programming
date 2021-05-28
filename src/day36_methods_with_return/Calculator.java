package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(33, 33));
        double sum = add(1, 3);
        System.out.println("Sum = " + sum);
        System.out.println("add( 100 + 200 ) : " + add(100, 200));

        System.out.println(minus(66, 33));
        double result = minus(3, 1);
        System.out.println("result = " + result);
        System.out.println("minus( 200 - 100 ) : " + minus(200, 100));

        System.out.println(multiply(6, 3));
        double result2 = multiply(3, 1);
        System.out.println("result2 = " + result2);
        System.out.println("multiply( 200 - 100 ) : " + multiply(200, 100));

        System.out.println(divide(16, 2));
        double result3 = divide(16, 2);
        System.out.println("result3 = " + result3);
        System.out.println("divide( 16 / 2 ) : " + divide(16, 2));

    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;

    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }

    public static double multiply(double num1, double num2) {
        double result2 = num1 * num2;
        return result2;
    }

    public static double divide(double num1, double num2) {
        double result3 = num1 / num2;
        return result3;
    }
}