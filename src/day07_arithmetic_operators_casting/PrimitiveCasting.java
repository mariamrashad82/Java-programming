package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int num1 = 100;
        byte b1 = (byte) num1;
        short shNum1 = (short) num1;
        System.out.println(num1);//100
        System.out.println(b1);//100
        System.out.println(shNum1);//100

        int count1 = 250;
        byte count2 = (byte) count1;
        long loCount1 = (long)count1;
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(loCount1);

    }
}
