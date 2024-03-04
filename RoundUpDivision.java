import java.util.Scanner;

public class RoundUpDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend (numerator): ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the divisor (denominator): ");
        int denominator = scanner.nextInt();

        int result = roundUpDivision(numerator, denominator);

        System.out.println("Result of rounded up division: " + result);
    }

    private static int roundUpDivision(int numerator, int denominator) {
        // Use the ceiling function to round up the division result
        return (numerator + denominator - 1) / denominator;
    }
}
