import java.util.Scanner;

public class pb12 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number: ");
        int inputNumber = scanner.nextInt();

        // Close the scanner to prevent resource leak


        // Extract the last digit
       // int lastDigit = Math.abs(inputNumber % 10);
        int lastDigit=0;
        if(inputNumber>=0){
             lastDigit=inputNumber%10;
        }
        else{
            System.out.println("you write wrong digit");
        }

        // Print the last digit
        System.out.println("The last digit is: " +lastDigit );
    }
}
