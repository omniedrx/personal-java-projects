package Bank_Simulator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();
        
        System.out.println("===Bank Account Simulator===");
        while (true) {
            System.out.println();
            System.out.println("1. Create account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check balance");
            System.out.println("5. Transfer");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = Integer.valueOf(input.nextLine());
            System.out.println();

            if (choice < 1 || choice > 6) {
                System.out.println("Choose only from 1 - 5");
                continue;
            }

            if (choice == 6) {
                break;
            }

            if (choice == 1) {
                System.out.print("Enter account name: ");
                String name = input.nextLine();
                System.out.print("Enter account number: ");
                int number = Integer.valueOf(input.nextLine());
                System.out.print("Enter starting balance: ");
                double balance = Double.valueOf(input.nextLine());

                bank.createAccounts(number, name, balance);
                System.out.println("Account created!");
            }

            if (choice == 2) {
                Account account = getAccountFromInput(input, bank);

                if (account == null) {
                    System.out.println("Account not found");
                    continue;
                }

                System.out.print("Deposit amount: ");
                double amount = Double.valueOf(input.nextLine());
                account.deposit(amount);
            }

            if (choice == 3) {
                Account account = getAccountFromInput(input, bank);

                if (account == null) {
                    System.out.println("Account not found");
                    continue;
                }

                System.out.print("Withdraw amount: ");
                double amount = Double.valueOf(input.nextLine());

                try {
                    account.withdraw(amount);
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            if (choice == 4) {
                Account account = getAccountFromInput(input, bank);

                if (account == null) {
                    System.out.println("Account not found");
                    continue;
                }

                System.out.println("Name: " + account.getOwnerName() + ", Current balance: " + account.getBalance());
            }

            if (choice == 5) {
                System.out.print("Withdraw from (enter acc number): ");
                int withdraw = Integer.valueOf(input.nextLine());
                System.out.print("Enter amount: ");
                double amount = Double.valueOf(input.nextLine());
                System.out.print("Deposit to (enter acc number): ");
                int deposit = Integer.valueOf(input.nextLine());

                bank.transfer(withdraw, deposit, amount);
            }
        }
    input.close();
    }

    private static Account getAccountFromInput(Scanner input, Bank bank) {
        System.out.print("Enter account number: ");
        int number = Integer.valueOf(input.nextLine());
        Account account = bank.findAccount(number);
        return account;
    }
}
