import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // All symbols which will be used for password
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Password length input
        System.out.print("Enter the password length: ");
        int passwordLength = scanner.nextInt();

        String password = "";

        for (int i = 0; i < passwordLength; i++) {

            // randomIndex gives random index from the String symbols
            int randomIndex = random.nextInt(symbols.length());
            
            // randomChar finds the symbol under this index from randomIndex
            char randomChar = symbols.charAt(randomIndex);

            // adding one random symbol
            password += randomChar;
        }

        System.out.println("Generated password: " + password);
        System.out.print("Test password strength? (y/n) ");
        String answer = scanner.next();

        switch (answer.toLowerCase()) {
            case "y", "yes":
                if (password.length() < 8) {
                    System.out.println("Weak password!");
                } else if (password.length() < 12) {
                    System.out.println("Good password!");
                } else {
                    System.out.println("Strong password!");
                }
            case "n", "no":
                System.out.println("Checking skipped...");
            default:
                break;
        }

        scanner.close();
    }
}