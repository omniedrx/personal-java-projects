import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <String> items = new ArrayList<>();

        int choice;

        while (true) {
            System.out.println("===== Shopping List =====");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View current items");
            System.out.println("4. Finish");
            System.out.println();

            System.out.print("Choose: ");
            choice = input.nextInt();
            input.nextLine();
            System.out.println();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice.");
                continue;
            }

            if (choice == 4) {
                break;
            }

            if (choice == 1) {
                System.out.print("Add item to list: ");
                String item = input.nextLine();
                items.add(item);
                System.out.println("Item added!");
            }

            if (choice == 2) {
                
            }

            System.out.println();
        }
        input.close();
    }
}