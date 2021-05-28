package day36_methods_with_return;

public class calculation {
    public static void main(String[] args) {
        System.out.println("(10  + 45) = " + Calculator.add(10,45));
        System.out.println("(100 - 40) = " + Calculator.minus(100,40));
        System.out.println("(100 * 4 ) = " + Calculator.multiply(100,4));
        System.out.println("(100 / 40) = " + Calculator.divide(100,20));

        double d1= 330.0;
        double d2= 320.0;
        double sum = Calculator.minus(d1,d2);
        System.out.println("sum = " + sum);

    }
}
