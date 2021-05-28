package day18_condition_practice_string_intro;

public class AuthenticationWithNestedIf {
    public static void main(String[] args) {
        int espLast4SSN = 2012;
        int espPinCode = 20012;
        int last4SSN = 2012;
        int pineCode = 5012;

        if (last4SSN == espLast4SSN && pineCode == espPinCode) {
            System.out.println("Authentication is correct");
        } else {
            System.out.println("Authentication is not correct");

        if (last4SSN != espLast4SSN) {
                System.out.println("Last 4 number of SSN not correct");

        if(espPinCode != pineCode){
            System.out.println("Pin code is not correct");
        }

        }
        }
    }

}
