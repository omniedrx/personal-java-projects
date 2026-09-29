package Bank_Simulator;

public class Account {
    private int accountNumber;
    private String ownerName;
    private double balance;

    public Account(int accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount >= 0.0) {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    } 

    
}
