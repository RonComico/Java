import java.util.Scanner;

public class BinaryRepresentation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        String binaryRepresentation = Integer.toBinaryString(number);
        int countZeros = binaryRepresentation.length() - binaryRepresentation.replaceAll("0", "").length();

        System.out.println("Binary representation: " + binaryRepresentation);
        System.out.println("Number of zeros: " + countZeros);
    }
}
