package MariamMethods;

public class daySelectorMethods {
    public static void main(String[] args) {
        System.out.println(getDay(4));
        System.out.println(getDay(6));
        for(int i = 1 ; i <= 8 ; i++){
            System.out.println(i + " = " + getDay(i));
        }
        String day = getDayName(4);
        System.out.println(day);

        String oneDay = getDayName(9);
        if(oneDay == null){
            System.out.println("NULL INVALID DAY");

        }


    }

    public static String getDay(int day) {
        switch (day) {
            case 1:
                return "Mon";
            case 2:
                return "tue";
            case 3:
                return "wed";
            case 4:
                return "thu";
            case 5:
                return "Fri";
            case 6:
                return "Sat";
            case 7:
                return "Sun";
            default:
                System.out.println("Invalid day");
                return null;


        }
    }
    public static String getDayName(int day){
        String dayName;
        switch (day){
            case 1 :
                dayName = "Mon";
                break;
            case 2 :
                dayName = "Tue";
                break;
            case 3:
                dayName = "WED";
                break;
            case 4 :
                dayName = "THU";
                break;
            case 5:
                dayName = "FRI";
                break;
            case 6:
                dayName = "SAT";
                break;
            case 7:
                dayName="SUN";
                break;
            default:
                System.out.println("INVALID DAY");
                dayName = null;
        }
        return dayName;
    }
}