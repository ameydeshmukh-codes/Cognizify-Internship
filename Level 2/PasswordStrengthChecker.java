
import java.util.Scanner;
public class PasswordStrengthChecker {
  
    /*  Password Strength Checker
        This program evaluates the strength of a given password based on various criteria
        such as length, inclusion of lowercase letters, uppercase letters, numbers, and special characters.
    */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password to check its strength: ");
        String password = scanner.nextLine();

        int strengthScore = 0;

        // Check length
        if (password.length() >= 8) strengthScore++;
        if (password.length() >= 12) strengthScore++;

        // Check for lowercase letters
        if (password.matches(".*[a-z].*")) strengthScore++;

        // Check for uppercase letters
        if (password.matches(".*[A-Z].*")) strengthScore++;

        // Check for numbers
        if (password.matches(".*[0-9].*")) strengthScore++;

        // Check for special characters
        if (password.matches(".*[!@#$%^&*()-_=+\\[\\]{}|;:',.<>?/`~].*")) strengthScore++;

        // Provide feedback
        System.out.println("Password Strength Score: " + strengthScore + " out of 6");

        if (strengthScore <= 2) {
            System.out.println("Weak Password");
        } else if (strengthScore <= 4) {
            System.out.println("Moderate Password");
        } else {
            System.out.println("Strong Password");
        }

        scanner.close();
    }

}
