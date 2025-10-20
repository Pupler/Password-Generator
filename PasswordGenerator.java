import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator {
    public static void main(String[] args) {
        // New object Random for generating random numbers
        Random random = new Random();

        // All symbols which will be used for password
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Password length input
        System.out.print("Enter the password length: ");
        Scanner scanner = new Scanner(System.in);
        int passwordLength = scanner.nextInt();
        scanner.close();

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
    }
}