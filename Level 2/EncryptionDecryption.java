import java.util.Scanner;

public class EncryptionDecryption {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("would you like to (e)ncrypt or (d)ecrypt a message?   ");
    String choice = scanner.nextLine().trim().toLowerCase();
   

    System.out.print("enter the file name or path: ");
    String filePath = scanner.nextLine();

    if (filePath.trim().isEmpty()) {
        System.out.println("File path cannot be empty.");
        scanner.close();
        return;
    }

if (choice.equals("e")) {
    encryptFile(filePath);
    
}
else if (choice.equals("d")) {
    decryptFile(filePath);
} else {
    System.out.println("Invalid choice. Please enter 'E' for encrypt or 'D' for decrypt.");
}

    scanner.close();
  }

  private static void encryptFile(String filePath) {
    // Placeholder for encryption logic
    System.out.println("Encrypting file: " + filePath);
    System.out.println("File encrypted successfully and saved to new file.");
    // Implement encryption logic here
  }

  private static void decryptFile(String filePath) {
    // Placeholder for decryption logic
    System.out.println("Decrypting file: " + filePath);
    System.out.println("File decrypted successfully and saved to new file.");
    // Implement decryption logic here
  }

}
