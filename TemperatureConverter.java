import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println();
        System.out.println("Choose the conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");

        System.out.println();
        System.out.print("Enter your choice: ");

        int choice;
        try {
            choice = Integer.valueOf(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid choice. Select only from 1-6.");
            return;
        }
        System.out.print("Enter temperature: ");

        double temperature;
        
        try {
            temperature = Double.valueOf(scan.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid temperature. Please enter a number.");
            return;
        }
        double converted = 0.0;
        System.out.println();

        if (choice == 1) {
            converted = (temperature * 9.0/5.0) + 32;
            System.out.println(temperature + "°C = " + converted + "°F");
        } else if (choice == 2) {
            converted = (temperature - 32) * 5.0/9.0;
            System.out.println(temperature + "°F = " + converted + "°C");
        } else if (choice == 3) {
            converted = temperature + 273.15;
            System.out.println(temperature + "°C = " + converted + " K");
        } else if  (choice == 4) {
            if (temperature >= 0) {
                converted = temperature - 273.15;
                System.out.println(temperature + " K = " + converted + "°C");
            } else {
                System.out.println("Kelvin cannot be lower than zero.");
            }
        } else if (choice == 5) {
            converted = (temperature - 32) * 5.0/9.0 + 273.15;
            System.out.println(temperature + "°F = " + converted + " K");
        } else if (choice == 6) {
            if (temperature >= 0) {
                converted = (temperature - 273.15) * 9.0/5.0 + 32;
                System.out.println(temperature + " K= " + converted + "°F");
            } else {
                System.out.println("Kelvin cannot be lower than zero.");
            }
        } else  {
            System.out.println("Invalid choice. Please select from 1-6");
        }
    }
}