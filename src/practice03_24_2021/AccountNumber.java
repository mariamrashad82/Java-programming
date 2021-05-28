package practice03_24_2021;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber = "5000000";
        if(accountNumber.startsWith("2")){// if(accountnumber.chatAt(0)=='2')
            if(accountNumber.length()==7){
            System.out.println("valid 7 digit account number");
        }else {
                System.out.println("not valid 7 digit account number");
            }
        }else if(accountNumber.startsWith("5")){

            if(accountNumber.length() == 10){
                System.out.println("valid 10 digit account number");
        }else {
                System.out.println("not valid 10 digit account number");

            }
        }else{
            System.out.println("not valid account number");
        }
    }
}
