package mariam_practice;
import java.util.*;
public class maxAndMinFrom5Number24 {
    public static void main(String[] args) {
        //[Max and Min from 5 numbers]
        //• Write a program that can ask the user "enter a number" five times
        //and return the maximum number
        //• Write a program that can ask the user "enter a number" five times
        //and return the minimum number


        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int dayCounter = 0;

        if (inhabitants >= 0) {
            do {
                System.out.println("Day " + dayCounter++ + " [" + inhabitants + "]");
                inhabitants = inhabitants / 2;

            } while (inhabitants >= 1);

            System.out.println("---- EXTINCT ----");
        } else {
            System.out.println("---- EXTINCT ----");
        }

        int num = 80;
        while(num>20){
            System.out.print(num+" ");
            num-=2;
        }
        System.out.println(num);


        int year =0;
        int treeSize = 0;

        do {
            year++;

            if (year > 0 && year <= 10) {

                treeSize++;
                System.out.println("year " + year + " - growth 1 cm");
                System.out.println("tree size: " + treeSize + "cm");
                 }else if(year==3){

                treeSize++;
                System.out.println("year "+year+"  - growth 1 cm");
                System.out.println("tree size: "+treeSize+"cm");

                }else if(year<7){
                 System.out.println("year "+year+" - growth 2 cm");
                treeSize += 2;
                System.out.println("tree size: "+treeSize+"cm");

                 }else{
                 System.out.println("year "+year+" - growth 2cm");
                 treeSize += 2;
                 System.out.println("tree size: "+treeSize+"cm");

                }
                 } while(year<10);

            }
        }













