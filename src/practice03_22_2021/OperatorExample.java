package practice03_22_2021;

public class OperatorExample {
    public static void main(String[] args) {
        int a = 3 , b = 2;
        long c = (a-- + b)* 2 / 3 % 2;  // (3+2) * 2 / 3 % 2
        System.out.println("c = " + c);// 5 * 2 / 3 % 2
        System.out.println("b = " + b);//10 / 3 % 2
        System.out.println("a = " + a);// 3 % 2 = 1

        short c2 = (short)((a-- + b)* 2 / 3 % 2); //tern int into short

        
        
    }
}
