package mariam_practice;

import java.util.Scanner;

public class campusHours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ENTER TIME ");
        int openHours = scan.nextInt();
        if(openHours > 8 && openHours < 23){
            System.out.println("Campus Is Open ");
        }else if(openHours < 8 && openHours >23){
            System.out.println("Campus Is Close");
        }else{
            System.out.println(" Invalid Time");
        }
    }
}
