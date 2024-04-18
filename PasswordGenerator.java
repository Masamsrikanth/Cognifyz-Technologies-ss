import java.util.*;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Password Generator!");

        // Prompt user for password length
        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        // Prompt user for password criteria
        System.out.print("Include numbers? (yes/no): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecialChars = scanner.next().equalsIgnoreCase("yes");

        // Generate password
        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecialChars);

        // Display generated password
        System.out.println("Your generated password is: " + password);
    }

    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, boolean includeUppercase, boolean includeSpecialChars) {
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String specialChars = "!@#$%^&*()-_=+<>?";

        StringBuilder validChars = new StringBuilder();
        if (includeLowercase) {
            validChars.append(lowercaseLetters);
        }
        if (includeUppercase) {
            validChars.append(uppercaseLetters);
        }
        if (includeNumbers) {
            validChars.append(numbers);
        }
        if (includeSpecialChars) {
            validChars.append(specialChars);
        }

        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(validChars.length());
            password.append(validChars.charAt(randomIndex));
        }

        return password.toString();
    }
}