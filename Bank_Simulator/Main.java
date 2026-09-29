package Bank_Simulator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account omnie = new Account(123456, "Omnie", 1000);
        
        System.out.println("===Bank Account Simulator===");
        System.out.println();
        while (true) {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            int choice = Integer.valueOf(input.nextLine());

            if (choice < 1 || choice > 4) {
                System.out.println("Choose only from 1 - 4");
                continue;
            }

            if (choice == 4) {
                break;
            }

            if (choice == 1) {
                System.out.print("How much? ");
                double amount = Double.valueOf(input.nextLine());
                omnie.deposit(amount);
            }

            if (choice == 2) {
                System.out.print("How much? ");
                double amount = Double.valueOf(input.nextLine());

                try {
                    omnie.withdraw(amount);
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            if (choice == 3) {
                System.out.println(omnie.getBalance());
            }
        }
    }
}
