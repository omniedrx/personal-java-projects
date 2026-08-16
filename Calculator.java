import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
        }

        System.out.println("Result: " + result);
    }
}
