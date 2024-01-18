import java.util.Scanner;

public class kjnjn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the seconds
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        // Convert seconds to minutes, hours, and remaining seconds
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        int hours = minutes / 60;
        minutes %= 60;

        // Display the result
        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + remainingSeconds + " seconds");
    }
}
