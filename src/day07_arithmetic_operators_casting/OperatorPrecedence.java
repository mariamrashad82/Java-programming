package day07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5);//15
        System.out.println(10 + 5 - 3);//12
        System.out.println(10 - 5 + 3);//8
        System.out.println((10 + 5) -3);//12
        System.out.println(10 + (5 - 3)); //2
        System.out.println(10 - (5 + 3)); //2

        System.out.println(2 * 3);
        System.out.println(2 * 3 / 3);
        System.out.println(20 / (2 * 2) );
        // System.out.println(10 / 0); its not working cant divided by zero

        System.out.println(2 + 5 * 3); //15 +2 =17
        System.out.println((2 + 5 ) * 3); //21

        System.out.println(10 / 3);//3
        System.out.println(5 / 2);//2
        //
        System.out.println(10.0 / 3.0);// 3.3333333
        System.out.println(5.0 /2.0);// 2.5
    }
}
