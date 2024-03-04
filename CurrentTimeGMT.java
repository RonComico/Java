import java.util.TimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CurrentTimeGMT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the time zone offset to GMT: ");
        int timeZoneOffset = scanner.nextInt();

        long currentTimeMillis = System.currentTimeMillis();
        Date date = new Date(currentTimeMillis - timeZoneOffset * 3600 * 1000);

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String formattedTime = sdf.format(date);

        System.out.println("Current time is " + formattedTime);
    }
}
