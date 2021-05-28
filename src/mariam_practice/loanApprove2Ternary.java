package mariam_practice;

public class loanApprove2Ternary {
    public static void main(String[] args) {
        double salary= 80.000;
        double creditScore = 600;
        String loan;
        loan=(salary>=60.000)&&(creditScore>=650) ? "loan Approve" : "loan denid";
        System.out.println("loan = " + loan);
        
    }
}
