package mariam_practice;

import java.util.Scanner;

public class validTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ******** ENTER THE THREE ANGLES ********* ");
        int angels1 = scan.nextInt();
        int angels2 = scan.nextInt();
        int angels3 = scan.nextInt();
        if(angels1 + angels2 + angels3 == 180){
            System.out.println("VALID TRIANGLE");
        }else{
            System.out.println("NOT VALID TRIANGLE");
        }
    }
}
