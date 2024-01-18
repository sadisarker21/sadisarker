import java.util.Scanner;

public class pb14 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int min=ob.nextInt();
        final int mc=125;
        final int mcharge=25;
      final   int mcharge2=49;
      final   int nocharge=500;
        int charge=0;
        int charge1=0;
        int charge2=0;
        int charge3=0;
        if(min<=nocharge){
            System.out.println("NO BILL");
        } else if (min>=nocharge&&min<=1000) {
            int devmin=min-nocharge;
            charge1=100/(devmin*mcharge);
            charge=mc+charge1;

        }
        /*else
            if(min>1001) {
            int devmin1=nocharge-min;
            charge2=100/(devmin1*mcharge2);
            charge3=mc+charge2;
        }

         */
        System.out.println("total charge is:"+charge+"taka");
        System.out.println("total charge is:"+charge3+"taka");

    }
}
