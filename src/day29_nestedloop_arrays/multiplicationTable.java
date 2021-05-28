package day29_nestedloop_arrays;

public class multiplicationTable {
    public static void main(String[] args) {
        int sum;
        for (int outer = 1; outer <= 5; outer++) {

            for (int inner = 1; inner <= 10; inner++) {
                sum = outer * inner;
                System.out.print( " (" +outer + " * " + inner + " = " + sum + ") ");
            }
            System.out.println();
        }
    }
}