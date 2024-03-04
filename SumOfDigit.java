import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of all digits is " + sum);
    }
}
