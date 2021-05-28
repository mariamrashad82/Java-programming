package day17_ternary_nested_condition;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String replay = (hourlyRate >45 ) ?" accept" : "reject";
        System.out.println("replay = " + replay);
       
       String todayClass = "java";
       String teacher = (todayClass.equals("java"))? " mouradil / saim " : "nadir";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive)? " have Dl, can drive" : " No Dl, can not drive";
        System.out.println("driving = " + driving);
        
    }
}
