import java.util.Random;
import java.util.Scanner;


public class PasswordGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // All symbols which will be used for password
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        System.out.print("1 - Generate password \n2 - Exit \n\nChoose what to do:");
        int chosenNumber = scanner.nextInt();

        if (chosenNumber == 1) {
            // Details input
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
                    break;
                case "n", "no":
                    System.out.println("Checking skipped...");
                    break;
                default:
                    break;
            }

            scanner.close();
        } else if (chosenNumber == 2) {
            System.out.print("Exiting...");
            System.exit(0);
        } else {
            System.out.print("Error ocurred! Try again.");
        }
    
    }
}