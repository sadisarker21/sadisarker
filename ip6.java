import java.util.Scanner;

public class ip6 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        int n =ob.nextInt(); // Set the number of rows

        for (int i = 1; i <= n; i++) {
            //prin space
            for (int k=0;k<=i;k++){
                System.out.print(" ");

            }            // Print characters
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A'+ i - 1 ));
            }

            // Move to the next line
            System.out.println();
        }
    }
}
