package day46_Encapsulation;

public class CheckingAccount {
   private double balance;
   private long accountNumber;
   private String accountHolder;
   private String type = "checking";

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getType() {
        return type;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}

