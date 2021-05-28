package day25_loops;

public class PrintEvenOrOddNumber {
    public static void main(String[] args) {


        System.out.print("even numbers from 0 - 100 = ");
        for (int num = 0; num <= 100; num++) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
            }



            System.out.println("\n");
            System.out.print("0dd number from 0 - 100 = ");

            for (int num1 = 1; num1 <= 100; num1++) {
                if (num1 % 2 != 0) {
                System.out.print(num1 + " ");
                }

            }
        }
    }



//           for(int i=0;i   <=100; i+=2){
//            System.out.println("Even numbers = "+ i);
//        }
//        for(int i=1;i<=100 ; i+=2){
//            System.out.println("Odd numbers = "+i);