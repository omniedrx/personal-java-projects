import java.util.Scanner;
import java.util.ArrayList;
public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();

        while (true) {
            System.out.println("=== TO-DO LIST ===");
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Complete task");
            System.out.println("4. Remove task");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = 0;
            try {
                choice = Integer.valueOf(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Numbers from 1-5 only.");
                continue;
            }

            if (choice < 1 || choice > 5) {
                System.out.println("Invalid input. Numbers from 1-5 only");
                continue;
            }

            if (choice == 5) {
                break;
            }

            if (choice == 1) {
                System.out.println();
                System.out.print("Enter task: ");
                String task = input.nextLine();
                tasks.add(task);
                System.out.println("Task added!");
                System.out.println();
            } 
            
            if (choice == 2) {
                System.out.println();
                System.out.println("Your tasks:");
                int i = 1;
                for (String task: tasks) {
                    System.out.println(i + ". " + task);
                    i++;
                }
                System.out.println();
            }

            if (choice == 3) {
                System.out.println();
                System.out.println("Your tasks:");
                int i = 1;
                for (String task: tasks) {
                    System.out.println(i + ". " + task);
                    i++;
                }
                System.out.print("Which task number is complete? ");
                int number; 
                try {
                    number = Integer.valueOf(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                    continue;
                }

                System.out.println("Task marked as complete.");
                System.out.println();
            }
        }
        input.close();
    }
}
