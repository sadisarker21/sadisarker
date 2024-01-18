import java.util.Scanner;

public class dayes {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int day= ob.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("this is workday");
            break;
            case 7:
            case 8:
                System.out.println("this is weekends");
        }
    }
}
