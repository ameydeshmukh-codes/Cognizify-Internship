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
         System.out.println("Temperature Converter");

        // Convert Celsius to Fahrenheit

        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();    
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is %.2f Fahrenheit%n", celsius, fahrenheit);  

        // Convert Fahrenheit to Celsius

        System.out.println("Enter temperature in Fahrenheit:");        
        double fahrenheitInput = scanner.nextDouble();    
        double celsiusConverted = fahrenheitToCelsius(fahrenheitInput);
        System.out.printf("%.2f Fahrenheit is %.2f Celsius%n", fahrenheitInput, celsiusConverted);
          

        //Celsius to Kelvin
        System.out.println("Enter temperature in Celsius:");
        double celsiusInput = scanner.nextDouble();
        double kelvin = celsiusToKelvin(celsiusInput);
        System.out.printf("%.2f Celsius is %.2f Kelvin%n", celsiusInput, kelvin);

       //  Kelvin to Celsius
        System.out.println("Enter temperature in Kelvin:");
        double kelvinInput = scanner.nextDouble();  
        double celsiusFromKelvin = kelvinToCelsius(kelvinInput);
        System.out.printf("%.2f Kelvin is %.2f Celsius%n", kelvinInput, celsiusFromKelvin); 
    

        // Fahrenheit to Kelvin

        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheitInput2 = scanner.nextDouble();
        double kelvinFromFahrenheit = fahrenheitToKelvin(fahrenheitInput2);
        System.out.printf("%.2f Fahrenheit is %.2f Kelvin%n", fahrenheitInput2, kelvinFromFahrenheit);
        
    // Kelvin to Fahrenheit
        System.out.println("Enter temperature in Kelvin:");
        double kelvinInput2 = scanner.nextDouble();
        double fahrenheitFromKelvin = kelvinToFahrenheit(kelvinInput2);
        System.out.printf("%.2f Kelvin is %.2f Fahrenheit%n", kelvinInput2, fahrenheitFromKelvin);
    scanner.close(); 
   
    }
}

    