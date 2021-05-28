package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        //int num1 = 1;
       // num1++;
       // ++num1;
        //System.out.println("num1 = " + num1);//3
        //v1
        int num1= 4;
        int num2 =++num1;
        System.out.println("num1 = " + num1);//5
        System.out.println("num2 = " + num2);//5
        int lip1= 4;
        int lip2 =num1++;
        System.out.println("lip1 = " + lip1);//4
        System.out.println("lip2 = " + lip2);//5

        int kk1 = 10;
        int kk2 =++kk1;
        System.out.println("kk1 = " + kk1);//11
        System.out.println("kk2 = " + kk2);//11
        //post _ increment
        int no3 = 4;
        int no4 = no3;
        no3++;
        System.out.println("no3 = " + no3);
        System.out.println("no4 = " + no4);
        //
        int num3= 8;
        int num4 = ++num3;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        //
        int apples = 5;
        int basket = ++ apples;
        System.out.println( " apples = " + apples );
        System.out.println( "basket = " + basket);
        //
        int kiwi = 15;
        int kiwiBox = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBox = " + kiwiBox);
        //
        int car = 5;
        System.out.println(++car);//6
        //
        int bag = 10;
        System.out.println(bag++);//10
        System.out.println(bag);//11
        //
        int cap = 44;
        cap++;
        System.out.println("cap = " + cap + "\n");
        //
       int a = 50;
       int b = 22;
       int c = a++  +  ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //

       



    }
}
