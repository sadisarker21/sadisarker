import java.util.Scanner;

public class case4 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        double BDT = ob.nextDouble();
        double USD = ob.nextDouble();
        double CAN =ob.nextDouble();
        double exchange=0;
        double exchange2=0;
        if(BDT>0){
            exchange=BDT *USD;
            exchange2=BDT*CAN;
        }
        System.out.println("MONEY EXCHANGE RATE IS :"+exchange +"taka");
        System.out.println("MONEY EXCHANGE RATE IS :"+exchange2 +"taka");
    }
}
