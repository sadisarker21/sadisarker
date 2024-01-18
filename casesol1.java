import java.util.Scanner;

public class casesol1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("ENTER THE OPRETOR:+,-,*,/");
        char operator = ob.next().charAt(0);
        System.out.println("enter the first number");
        int number1 = ob.nextInt();
        System.out.println("enter the second number");
        int number2 = ob.nextInt();
        int result=0;
        switch (operator) {
            case '*' -> result = number1 * number2;
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '/' -> result=number1/number2;

            default -> System.out.println("this is invailid");

        }
        System.out.println(result);
       // System.out.println(result);
    }
}
