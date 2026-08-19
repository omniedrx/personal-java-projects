package Calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first number: ");
                double num1 = Double.valueOf(scan.nextLine());
                System.out.print("Enter operator (+, -, *, /): ");
                String operator = scan.nextLine();
                System.out.print("Enter second number: ");
                double num2 = Double.valueOf(scan.nextLine());

                double result = 0;
                if (operator.equals("+")) {
                    result = num1 + num2;
                } else if (operator.equals("-")) {
                    result = num1 - num2;
                } else if (operator.equals("*")) {
                    result = num1 * num2;
                } else if (operator.equals("/")) {
                    result = num1 / num2;
                } else {
                    System.out.println("Invalid operator");
                    continue;
                }

                System.out.println();
                System.out.println("Result: " + result);
                System.out.println();
                System.out.print("Calculate again? (y/n): ");
                String repeat = scan.nextLine();

                if (repeat.equals("y")) {
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please enter a number.");
            }
        }
    }
}
