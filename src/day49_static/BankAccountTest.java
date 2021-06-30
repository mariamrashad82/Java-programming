package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "husband";
        husband.showBalance(); //500
        husband.spend(100.0);
        husband.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend(400);
        wife.showBalance();

        husband.showBalance();
        //System.out.println(BankAccount.balance);
    }
}
