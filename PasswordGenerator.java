import java.util.Random;


public class PasswordGenerator {
    public static void main(String[] args) {
        // New object Random for generating random numbers
        Random random = new Random();

        // All symbols which will be used for password
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        
        // Password length
        int passwordLength = 10;

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