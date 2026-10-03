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
            System.out.println("5. Exit");
            System.out.print("Choose: ");
            int choice = Integer.valueOf(input.nextLine());
            System.out.println();

            if (choice < 1 || choice > 5) {
                System.out.println("Choose only from 1 - 4");
                continue;
            }

            if (choice == 5) {
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
                System.out.print("Enter account number: ");
                int number = Integer.valueOf(input.nextLine());
                Account account = bank.findAccount(number);

                if (account == null) {
                    System.out.print("Account not found");
                    continue;
                }

                System.out.print("Deposit amount: ");
                double amount = Double.valueOf(input.nextLine());
                account.deposit(amount);
            }

            if (choice == 3) {
                System.out.print("Enter account number: ");
                int number = Integer.valueOf(input.nextLine());
                Account account = bank.findAccount(number);

                if (account == null) {
                    System.out.print("Account not found");
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
                System.out.print("Enter account number: ");
                int number = Integer.valueOf(input.nextLine());
                Account account = bank.findAccount(number);

                if (account == null) {
                    System.out.print("Account not found");
                    continue;
                }

                System.out.println("Name: " + account.getOwnerName() + ", Current balance: " + account.getBalance());
            }
        }
    }
}
