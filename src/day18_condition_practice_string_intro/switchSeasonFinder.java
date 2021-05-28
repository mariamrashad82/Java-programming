package day18_condition_practice_string_intro;

public class switchSeasonFinder {
    public static void main(String[] args) {
        int month = 4;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println(" WINTER");


                }
                switch (month) {
                    case 12:
                        System.out.println(" WINTER");
                        break;
                    case 1:
                        System.out.println(" WINTER");
                        break;
                    case 2:
                        System.out.println(" WINTER");
                        break;
                }
                //or logic with switch
                switch (month) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println(" WINTER");
                        break;

                    case 3:
                    case 4:
                    case 5:
                        System.out.println("SPRING");
                        break;

                    case 6:
                    case 7:
                    case 8:
                        System.out.println("SUMMER");
                        break;

                    case 9:
                    case 10:
                    case 11:
                        System.out.println("FALL");
                        break;

        }
            }

        }
