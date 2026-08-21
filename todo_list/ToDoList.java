import java.util.Scanner;
import java.util.ArrayList;
public class ToDoList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Task> tasks = new ArrayList<Task>();

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
                tasks.add(new Task(task));
                System.out.println("Task added!");
                System.out.println();
            } 
            
            if (choice == 2) {
                System.out.println();
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                    System.out.println();
                    continue;
                }
                System.out.println("Your tasks:");
                int i = 1;
                for (Task task: tasks) {
                    System.out.println(i + ". " + task);
                    i++;
                }
                System.out.println();
            }

            if (choice == 3) {
                System.out.println();
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                    System.out.println();
                    continue;
                }
                System.out.println("Your tasks:");
                int i = 1;
                for (Task task: tasks) {
                    System.out.println(i + ". " + task);
                    i++;
                }
                System.out.print("Which task number is complete? ");
                int index; 
                try {
                    index = Integer.valueOf(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                    continue;
                }

                index -= 1;
                if (index < 0 || index >= tasks.size()) {
                    System.out.println("Invalid input. It can't be less/higher than the amount of tasks.");
                    continue;
                }

                tasks.get(index).markComplete();

                System.out.println("Task marked as complete.");
                System.out.println();
            }

            if (choice == 4) {
                System.out.println();
                if (tasks.isEmpty()) {
                    System.out.println("No tasks yet.");
                    System.out.println();
                    continue;
                }
                System.out.println("Your tasks:");
                int i = 1;
                for (Task task: tasks) {
                    System.out.println(i + ". " + task);
                    i++;
                }
                System.out.print("Which task number to remove? ");
                int index; 
                try {
                    index = Integer.valueOf(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input.");
                    continue;
                }

                index -= 1;
                if (index < 0 || index >= tasks.size()) {
                    System.out.println("Invalid input. It can't be less/higher than the amount of tasks.");
                    continue;
                }

                tasks.remove(index);

                System.out.println("Task removed.");
                System.out.println();
            }
        }
        input.close();
    }
}   