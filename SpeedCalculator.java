import java.util.Scanner;

public class SpeedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();
        System.out.print("Input hours: ");
        int hours = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();

        double totalTimeInSeconds = hours * 3600 + minutes * 60 + seconds;
        double speedInMetersPerSecond = distance / totalTimeInSeconds;
        double speedInKmPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);
        double speedInMilesPerHour = distance / 1609.0 / (totalTimeInSeconds / 3600);

        System.out.println("Your speed in meters/second is " + speedInMetersPerSecond);
        System.out.println("Your speed in km/h is " + speedInKmPerHour);
        System.out.println("Your speed in miles/h is " + speedInMilesPerHour);
    }
}
