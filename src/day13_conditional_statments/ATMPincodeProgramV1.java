package day13_conditional_statments;


public class ATMPincodeProgramV1 {
        public static void main(String[] args) {
            System.out.println("***** WELCOME TO DO BANK ATM *****");
            System.out.println("enter your pin code");
           int secretPinCode = 2012;
            int inputPinCode = 2012;
            if (secretPinCode == inputPinCode ) {
                System.out.println("welcome to your account " + secretPinCode );
                System.out.println("you can check your balance");
            }else {
                System.out.println(" your pin code is wrong " + inputPinCode+ " please try again");
            }

        }
    }