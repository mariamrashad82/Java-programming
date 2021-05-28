package practice03_08_2021;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        // declare 2  variables: length ND WIDTH
        // calculate the perimeter 2(l*w)
        // calculate the area (w * l)
       // double length = 5;
      //  double width = 3;
       // double perimeter = 2 * (length + width);
       // System.out.println("perimeter = " + perimeter);
      //  double area = length * width;
       // System.out.println("area = " + area);
        // dynamic with scanner
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        double width = input.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("perimeter = " + perimeter);
        double area = length * width;
         System.out.println("area = " + area);


    }
}
