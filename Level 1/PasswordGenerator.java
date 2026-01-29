
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
// Password Generator
    public static void main(String[] args) {        

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.nextLine().equalsIgnoreCase("y");

        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecial = scanner.nextLine().equalsIgnoreCase("y");

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}|;:',.<>?/`~";

        StringBuilder characterPool = new StringBuilder();

        if (includeLowercase) {
            characterPool.append(lowercase);
        }
        if (includeUppercase) {
            characterPool.append(uppercase);
        }
        if (includeNumbers) {
            characterPool.append(numbers);
        }
        if (includeSpecial) {
            characterPool.append(special);
        }

        if (characterPool.length() == 0) {
            System.out.println("No character types selected. Cannot generate password.");
            scanner.close();
            return;
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        System.out.println("Generated Password: " + password.toString());
        scanner.close();
    }

}
