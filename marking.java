import java.util.Scanner;

public class marking {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int mark =ob.nextInt();
        if(mark >=80){
            System.out.println("point is A+");
        }
        else if (mark >=70) {
            System.out.println("point is A");

        }
        else if (mark >=60){
            System.out.println("point is A-");
        }
        else if (mark >=50) {
            System.out.println("point is B");
        } else if (mark >=40) {
            System.out.println("point is C");
        }
        else if (mark >=33){
            System.out.println("POINT IS D");
        }
        else {
            System.out.println("faild");
        }
    }
}
