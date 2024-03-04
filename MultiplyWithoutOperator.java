import java.util.Scanner;

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int result = multiplyWithoutOperator(num1, num2);
        System.out.println("Product: " + result);
    }

    private static int multiplyWithoutOperator(int a, int b) {
        int result = 0;
        while (b > 0) {
            if ((b & 1) == 1) {
                result += a;
            }
            a <<= 1;
            b >>= 1;
        }
        return result;
    }
}
