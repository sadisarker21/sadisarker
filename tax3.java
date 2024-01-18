import java.util.Scanner;

public class tax3 {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        double income=ob.nextDouble();
        double mntax =income -300000;
        double tax;
        if(mntax <=100000){
            tax=mntax*0.05;
            // System.out.println(tax);
        } else if (mntax<=(100000 +300000)) {
            tax =(100000*0.05)+((mntax-100000)*0.10);
            // System.out.println(tax);
        } else if (mntax <= (100000 + 300000+400000)) {
            tax= (100000+0.05)+(300000+0.10)+((mntax-(100000+300000)*0.15));
        }

        else if (mntax <= (100000+300000+400000+500000)) {
            tax=(100000*0.05)+(300000*0.10)+(400000+0.15)+
                    ((mntax-(100000+300000+400000))*0.20);
        }
        else
        {
            tax =(100000*0.05+300000*0.10+400000*0.15+500000*0.20)+((mntax-(100000+300000+400000+500000))*0.25);

        }
        System.out.println("tax is:"+tax+"taka");
    }
}
