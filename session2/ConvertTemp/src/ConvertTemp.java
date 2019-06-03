import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double fahrenheit, celsius;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println(fahrenheit + " fahrenheit = " + fahrenheitToCelsius(fahrenheit) + " celsius");
                    break;
                case 2:
                    System.out.println("Enter celsius: ");
                    celsius = input.nextDouble();
                    System.out.println(celsius + " celsius = " + celsiusToFahrenheit(celsius) + " fahrenheit");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
