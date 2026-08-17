import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println();
        System.out.println("Choose the conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = Integer.valueOf(scan.nextLine());
        System.out.print("Enter temperature: ");
        double temperature = Double.valueOf(scan.nextLine());
        double converted = 0.0;
        System.out.println();

        if (choice == 1) {
            converted = (temperature * 9/5) + 32;
            System.out.println(temperature + "°C = " + converted + "°F");
        } else if (choice == 2) {
            converted = (temperature - 32) * 5/9;
            System.out.println(temperature + "°F = " + converted + "°C");
        } else {
            System.out.println("Invalid input");
        }
    }
}