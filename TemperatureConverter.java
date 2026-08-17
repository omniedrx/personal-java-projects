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
        } else if (choice == 3) {
            converted = temperature + 273.15;
            System.out.println(temperature + "°C = " + converted + " K");
        } else if  (choice == 4) {
            converted = temperature - 273.15;
            System.out.println(temperature + " K = " + converted + "°C");
        } else if (choice == 5) {
            converted = (temperature - 32) * 5/9 + 273.15;
            System.out.println(temperature + "°F = " + converted + " K");
        } else if (choice == 6) {
            converted = (temperature - 273.15) * 9/5 + 32;
            System.out.println(temperature + " K= " + converted + "°F");
        } else  {
            System.out.println("Invalid number");
        }
    }
}