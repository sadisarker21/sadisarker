import java.util.Scanner;

public class pse {
    public static void main(String[] args) {
        // Taking input for the number of minutes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Defining constants
        final int BASE_MINUTES = 500;
        final int BASE_CHARGE = 125;
        final int CHARGE_PER_MINUTE_ABOVE_500 = 25;
        final int CHARGE_PER_MINUTE_ABOVE_1000 = 49;

        // Calculating the charge
        int charge = 0;

        if (minutes <= BASE_MINUTES) {
            // No additional charge up to the first 500 minutes
            charge = BASE_CHARGE;
        } else if (minutes > BASE_MINUTES && minutes <= 1000) {
            // Calculate charge for minutes above 500 up to 1000
            int additionalMinutes = minutes - BASE_MINUTES;
            charge = BASE_CHARGE + (additionalMinutes * CHARGE_PER_MINUTE_ABOVE_500);
        } else if (minutes > 1001) {
            // Calculate charge for minutes above 1000
            int additionalMinutes = minutes - 1000;
            charge = BASE_CHARGE + (500 * CHARGE_PER_MINUTE_ABOVE_500) + (additionalMinutes * CHARGE_PER_MINUTE_ABOVE_1000);
        } else {
            // Displaying a message for invalid input
            System.out.println("Invalid input. Please enter minutes greater than 0.");
            // Closing the scanner
            scanner.close();
            return;
        }

        // Displaying the result
        System.out.println("The bill amount for " + minutes + " minutes is " + charge + " taka.");

        // Closing the scanner
        scanner.close();
    }
}
