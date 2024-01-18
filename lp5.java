import java.util.Scanner;

public class lp5 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int input=ob.nextInt();
        int c=input;
        int s=0;
        int j=0;
        while (0<input){
            int r=input%10;
            s=(10*j)+r;
            input/=10;

        }
        if (s==c){
            System.out.println("this is n");
        }
        else
            System.out.println("this is p");
    }

}
