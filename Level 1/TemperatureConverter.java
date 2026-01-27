import java.util.Scanner;

public class TemperatureConverter {

public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;

    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double input,result;

         System.out.println("Temperature Converter");

         do {
            System.out.println("Choose conversion:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("7. Exit");
              System.out.println("Enter your preferred option: ");
            choice = scanner.nextInt();
    
        

         switch (choice) {

            case 1:
                System.out.println("Enter temperature in Celsius:");
                input = scanner.nextDouble();
                result = celsiusToFahrenheit(input);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", input, result);
                break;
            case 2:
                System.out.println("Enter temperature in Fahrenheit:");
                input = scanner.nextDouble();
                result = fahrenheitToCelsius(input);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", input, result);
                break;
            case 3:
                System.out.println("Enter temperature in Celsius:");
                input = scanner.nextDouble();
                result = celsiusToKelvin(input);
                System.out.printf("%.2f Celsius is %.2f Kelvin%n", input, result);
                break;
            case 4:
                System.out.println("Enter temperature in Kelvin:");
                input = scanner.nextDouble();
                result = kelvinToCelsius(input);
                System.out.printf("%.2f Kelvin is %.2f Celsius%n", input, result);
                break;
            case 5:
                System.out.println("Enter temperature in Fahrenheit:");
                input = scanner.nextDouble();
                result = fahrenheitToKelvin(input);
                System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", input, result);
                break;
            case 6:
                System.out.println("Enter temperature in Kelvin:");
                input = scanner.nextDouble();
                result = kelvinToFahrenheit(input);
                System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", input, result);
                break;
            case 7:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
              
         }
        }
      while (choice != 7);
    scanner.close();    

   
    }
}
