import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("=== Temperature Converter ===");
            System.out.println();
            System.out.println("Choose the conversion:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");

            System.out.println();
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Select only from 1-7.");
                continue;
            }
            if (choice == 7) {
                break;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Select only from 1-7.");
                System.out.println();
                continue;
            }
            System.out.print("Enter temperature: ");

            double temperature;
            
            try {
                temperature = Double.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid temperature. Please enter a number.");
                continue;
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
                if (converted < 0.0) {
                    System.out.println("Invalid. Kelvin cannot be lowered than 0.");
                    System.out.println();
                    continue;
                }
                System.out.println(temperature + "°C = " + converted + " K");
            } else if  (choice == 4) {
                if (temperature >= 0) {
                    converted = temperature - 273.15;
                    System.out.println(temperature + " K = " + converted + "°C");
                } else {
                    System.out.println("Kelvin cannot be lower than zero.");
                    System.out.println();
                    continue;
                }
            } else if (choice == 5) {
                converted = (temperature - 32) * 5.0/9.0 + 273.15;
                if (converted < 0.0) {
                    System.out.println("Invalid. Kelvin cannot be lowered than 0.");
                    System.out.println();
                    continue;
                }
                System.out.println(temperature + "°F = " + converted + " K");
            } else if (choice == 6) {
                if (temperature >= 0) {
                    converted = (temperature - 273.15) * 9.0/5.0 + 32;
                    System.out.println(temperature + " K = " + converted + "°F");
                } else {
                    System.out.println("Kelvin cannot be lower than zero.");
                    System.out.println();
                    continue;
                }
            }
            
            System.out.println();
            System.out.println("Convert another temperature?: ");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.println();

            System.out.print("Choice: ");
            int loop;
            try {
                loop = Integer.valueOf(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice.");
                continue;
            }
            
            if (loop == 1) {
                continue;
            } else if (loop == 2) {
                break;
            } else {
                System.out.println("Invalid choice.");
                continue;
            }
        }
    }
}