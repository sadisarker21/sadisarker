import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        if(a%2==0)
        {
            System.out.println("this is even");
        }
        else
            System.out.println("this is odd");
    }
}
