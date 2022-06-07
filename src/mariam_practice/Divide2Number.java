package mariam_practice;

import java.util.Scanner;

public class Divide2Number {
    public static void main(String[] args) {
        // 10/5=2

        int a,b,c,result = 0;
        a=10;
        b=5;
       c=a+b;
       while (c>b) {
           c = c - b;
           result++;
       }
           System.out.println(result);

    }
}
