package Practice03_30_2021;

import java.util.Scanner;

public class maxNumberFrom5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = input.nextInt();
        int max = first; // 132
        int min = first;

        for(int i=0; i < 4; i++ ) {
            System.out.println("Enter a number");
            int number = input.nextInt();

            if(number > max) {
                max = number;
            }
            if(number < min) {
                min = number;
            }

        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);




    }


}
