import java.util.Scanner;

public class pb_11 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int c=ob.nextInt();
        int sum=0;
        int gor=0;


       //sotkora
        if(a>b&&a>c){
            System.out.println(a);
        } else if (b>a&&b>c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        //ghor number
        gor=(a+b+c)/3;
        // total addition
        sum=a+b+c;

        System.out.println(sum);
       System.out.println(gor);


    }
}
