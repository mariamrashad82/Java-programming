package day46_Encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
     CheckingAccount account1 = new CheckingAccount();
     account1.setAccountHolder("Mariam");
        System.out.println("account1.getAccountHolder() = " + account1.getAccountHolder());
     account1.setAccountNumber(234);
        System.out.println("account1.getAccountNumber() = " + account1.getAccountNumber());
     account1.setBalance(2490);
        System.out.println("account1.getBalance() = " + account1.getBalance());
        System.out.println("account1.getType() = " + account1.getType());
        System.out.println("account1.toString() = " + account1.toString());
        System.out.println(account1);
    }
    
}
