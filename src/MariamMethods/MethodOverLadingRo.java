package MariamMethods;

public class MethodOverLadingRo {
    public static void main(String[] args) {
        System.out.println(sum1(5,2,5));
        System.out.println(sum2(34.5,3.45,9.87));
        System.out.println(sum3("Jesus", "\n" + "IS","\n" + "love"));

    }
    public static int sum1(int num1,int num2,int num3){

        return num1+num2+num3;
    }
    public static double sum2(double num1,double num2 ,double num3){

        return num1-num2-num3;
    }
    public static String sum3(String a ,String b,String c){

        return a+b+c;
    }
}
