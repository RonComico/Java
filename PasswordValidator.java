import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
    }

    private static boolean isValidPassword(String password) {
        // Check length
        if (password.length() < 10) {
            return false;
        }

        // Check if it contains only letters and digits
        if (!password.matches("[a-zA-Z0-9]+")) {
            return false;
        }

        // Check if it contains at least two digits
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
