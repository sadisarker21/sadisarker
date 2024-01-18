import java.util.Scanner;

public class pb18 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int sles=ob.nextInt();
        int fnd=ob.nextInt();
        int sb=ob.nextInt();
        int mul=fnd*sb;
        if(sles>=mul)
        {
            System.out.println("frnend wiil eat this");
        }
        else
            System.out.println("friend will not eat this pizza");
        System.out.println();
    }
}
