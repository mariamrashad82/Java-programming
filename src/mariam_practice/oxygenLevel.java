package mariam_practice;

import java.util.Scanner;

public class oxygenLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("******DIVING IN OXYGEN LEVEL******");
        System.out.println("ENTRE YOUR OXYGEN LEVEL");
        double oxygenLevel = scan.nextInt();
        if(oxygenLevel>=90) {
            System.out.println("TANK IS FULL");
        }else if (oxygenLevel >= 80) {
            System.out.println("STILL OKAY");
        }else if (oxygenLevel >= 70) {
            System.out.println("DO NOT GO TOO FAR");
        }else if (oxygenLevel >= 60) {
            System.out.println("START TO HEAD BACK");
        }else if (oxygenLevel >= 50) {
             System.out.println("BE CAReFUL NOE YOU AT 50% ! ");
        } else {
             System.out.println("PLEASE STAY HOME");
                        }
                    }
                }






