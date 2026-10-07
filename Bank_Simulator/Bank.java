package Bank_Simulator;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccounts(int accountNumber, String ownerName, double startingBalance) {
        Account account = new Account(accountNumber, ownerName, startingBalance);
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {
        for (Account account: accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
        try {
            findAccount(fromAccountNumber).withdraw(amount);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        findAccount(toAccountNumber).deposit(amount);
    }
}