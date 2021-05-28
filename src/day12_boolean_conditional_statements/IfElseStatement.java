package day12_boolean_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println(" condition is true ");
        } else {
            System.out.println("condition is false");
        }
        int count = 25;
        if (count > 30) {
            System.out.println("count is more than 30");
        } else {
            System.out.println("count is less than 30");
        }
        //
        System.out.println("\n");
        byte age = 15;
        if (age >= 18) {
            System.out.println("Eligible to vote" + "\n" + "Age is greater than 18");

        }else{
            System.out.println("Not Eligible to vote" + "\n"+ "Age is less than 18" );

        }
    }

}