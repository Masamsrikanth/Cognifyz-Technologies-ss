import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        String unit = scanner.next();

        double convertedTemperature;

        if (unit.equalsIgnoreCase("C")) {
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f°C is %.2f°F\n", temperature, convertedTemperature);
        } else if (unit.equalsIgnoreCase("F")) {
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f°F is %.2f°C\n", temperature, convertedTemperature);
        } else {
            System.out.println("Invalid unit of measurement. Please enter 'C' or 'F'.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}