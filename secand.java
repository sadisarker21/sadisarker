import java.util.Scanner;

public class secand {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int sce=ob.nextInt();
        int min= sce/60;
        int rems= sce%60;
        int hour=min / 60;
        min %=60;
        System.out.println("hour is:"+hour+"minutes is :"+min+"secand is "+rems);

    }
}
