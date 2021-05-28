package day26_loopsWithString;

public class WeekDays {
    public static void main(String[] args) {
        //int day =1;
        for (int day = 1; day <=8 ; day++) {
            switch (day) {
                case 1:
                    System.out.println("day " +day+" : Monday");
                    break;
                case 2:
                    System.out.println("day " +day+" : Tusday");
                    break;
                case 3:
                    System.out.println("day " +day+" : Wednesday");
                    break;
                case 4:
                    System.out.println("day " +day+" : Thursday");
                    break;
                case 5:
                    System.out.println("day " +day+" : Friday");
                    break;
                case 6:
                    System.out.println("day " +day+" : Saturday");
                    break;
                case 7:
                    System.out.println("day " +day+" : Sunday");
                    break;
                default:
                    System.out.println("No such day, it is java day");
                    break;

            }
        }
    }
}
