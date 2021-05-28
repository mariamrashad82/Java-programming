package practice03_10_2021;

import java.util.Scanner;

public class seasonAndDayLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE SEASON NUMBER:\n 1-spring\n 2-summer \n 3- fall \n 4- winter ");
        int season = scan.nextInt();
        int day = 0;
        int night = 0;
        String seasonName = "";

        if (season == 1) {
            day = 14;
            night = 10;
            seasonName = "Spring";
        }
        if (season == 2) {
            day = 16;
            night = 8;
            seasonName = "Summer";
        }
        if (season == 3) {
            day = 14;
            night = 10;
            seasonName = "fall";
        }
        if (season == 4) {
            day = 12;
            night = 12;
            seasonName = "winter";
        }
        System.out.println("in " + seasonName + " there is " + day + " hours of day " + night + " hours of night ");
    }
}