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
}