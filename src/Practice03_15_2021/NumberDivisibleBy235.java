package Practice03_15_2021;

public class NumberDivisibleBy235 {
    public static void main(String[] args) {
        int num = 65;
        boolean by2 = num % 2 == 0;
        boolean by3 = num % 3 == 0;
        boolean by5 = num % 5 == 0;
        System.out.println( num + " is divisable by 2 " + by2);
        System.out.println( num + " is divisable by 3 " + by3);
        System.out.println( num + " is divisable by 5 " + by5);

    }
}
