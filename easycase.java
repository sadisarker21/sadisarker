import java.util.Scanner;

public class easycase {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int day= ob.nextInt();
        switch (day){
            case 1,2,3,4,5,6 -> System.out.print("this is workday");
            case 8,9 -> System.out.println("this is weekends");
        }
    }
}
