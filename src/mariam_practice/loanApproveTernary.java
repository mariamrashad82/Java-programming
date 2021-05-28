package mariam_practice;

public class loanApproveTernary {
    public static void main(String[] args) {
        double yearlySalary = 70.000;
        double creditScore = 800;
        if (yearlySalary > 60.000) {
            System.out.println("loan approve");
        }
        if (creditScore > 650) {
            System.out.println("loan approve");
        } else {
            System.out.println("loan dined");
        }


    }
}
