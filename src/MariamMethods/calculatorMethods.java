package MariamMethods;

public class calculatorMethods {
    public static void main(String[] args) {
        System.out.println(add(33,33));
        System.out.println(min(50,20));
        System.out.println(mul(5,5));
    }
    public static double add(double num1 , double num2){
        double sum = num1+num2;
        return sum;
    }
    public static double min(double num1,double num2){
        double sum1 = num1-num2;
        return sum1;
    }
    public static int mul(int num1 ,int num2 ){
        int sum3 = num1*num2;
        return sum3;
    }
}
