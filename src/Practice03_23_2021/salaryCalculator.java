package Practice03_23_2021;

public class salaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 10;
        int weeklyHours = 40;
        int numberOfWeek = 52;
        boolean isHourlyRateIsValid = hourlyRate > 0;
        boolean weeklyHoursAreValid = weeklyHours > 0 && weeklyHours <= 65;
        boolean numberOfWeeksAreValid = numberOfWeek > 0 && numberOfWeek <= 52;

        if (isHourlyRateIsValid) {

            if (weeklyHoursAreValid) {
                if (numberOfWeeksAreValid) {
                    System.out.println("salary is : " + (hourlyRate * weeklyHours * numberOfWeek));
                } else {
                    System.out.println(" number of weeks can not be less than 1 or greater than 52");
                }

            } else {
                System.out.println("Hourly rate can not be negative or zero or more than 65");
            }
        } else {
            System.out.println(" Hourly rate can not be negative or zero");

        }



        }
    }
