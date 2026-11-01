import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ArrayList <String> items = new ArrayList<>();

        int choice;
        int removeItem;

        while (true) {
            System.out.println("===== SHOPPING LIST =====");
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
                System.out.println("Invalid choice. Choose only from option 1 - 4.");
                System.out.println();
                continue;
            }

            if (choice == 4) {
                break;
            }

            if (choice == 1) {
                System.out.print("Add item to list: ");
                String item = input.nextLine();

                if (item.equals("")) {
                    System.out.println("Your input is empty!");
                    System.out.println();
                    continue;
                }
                items.add(item);
                System.out.println("Item added!");
            }

            if (choice == 2) {
                if (items.size() <= 0) {
                    System.out.println("You have not listed any items yet.");
                    System.out.println();
                    continue;
                }

                System.out.println("Current items in the list: ");
                System.out.println();
                getItems(items);
                System.out.print("Remove item: ");
                removeItem = input.nextInt();

                if (removeItem < items.size() || removeItem > items.size()) {
                    System.out.println("Invalid input. Choose only from the current number of items in the list.");
                    System.out.println();
                    continue;
                }

                items.remove(removeItem - 1);
                System.out.println();
                System.out.println("Item removed.");
            }

            if (choice == 3) {
                if (items.size() <= 0) {
                    System.out.println("You have not listed any items yet.");
                    System.out.println();
                    continue;
                }

                System.out.println("Current items in the list: ");
                System.out.println();
                getItems(items);
            }

            System.out.println();
        }

        if (items.size() <= 0) {
            System.out.println("Your shopping list is empty!");
        } else {
            System.out.println("===== YOUR SHOPPING LIST TODAY =====");
            getItems(items);
        }

        input.close();
    }

    static void getItems(ArrayList<String> items)  {
        int numItem = 1;
        for (String item: items) {
            System.out.println(numItem + ". " + item);
            numItem++;
        }
    }
}