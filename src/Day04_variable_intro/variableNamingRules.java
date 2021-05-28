package Day04_variable_intro;

public class variableNamingRules {
    public static void main(String[] args) {
        // System.out.println("break");
        // int static = 22; =====error, static is reserved by java
        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
        // int 1stMonthSalary = 3000;== ERROR, can not start with number.
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
        // above variables works, but not recommended
        //we should use meaningful variable names
        // int number-of-friends = 400; ====error
       // int numberOfFriends = 401;
       // int number_Of_Friends = 400


    }
}
