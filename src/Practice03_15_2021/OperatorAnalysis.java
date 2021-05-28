package Practice03_15_2021;

public class OperatorAnalysis {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        System.out.println("a = "+  a);
        System.out.println("b= " + b);
        System.out.println("\n\n");

        int c =200;
        int bb= -c++ + - --c * c-- % 2 + c ;
        System.out.println("c = " + c);
        System.out.println("b = " + bb);
        System.out.println("\n\n");


    }
}
