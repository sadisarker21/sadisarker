import java.util.Scanner;

public class timecalculate {
    public static void main(String[] args) {
        Scanner ob =new Scanner(System.in);
        int sec = ob.nextInt();
        int min = sec / 60 ;
        int lastsec = sec % 60 ;
        int hour = min / 60 ;
        min%= 60;
        System.out.println("minute is :"+ min +"secand is :" + lastsec + "hour is :" + hour);
    }

}
