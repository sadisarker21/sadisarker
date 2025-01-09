import java.util.Scanner;

public class bkash {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        double money= ob.nextInt();

        double change=0;

        change = money/(100/1.85);
        System.out.println("charge is :"+change);
        System.out.println("Changes: "+change);

    }
}
