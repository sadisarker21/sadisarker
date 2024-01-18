import java.util.Scanner;

public class lp3 {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);

        System.out.println("how many product do you like to buy");
        int P=ob.nextInt();
        System.out.println("Enter you pruduct price");
        int p1=ob.nextInt();
        int p2=ob.nextInt();
        int jog=(p1+p2);
        double out=jog*0.15;
        double add =out+jog;


        System.out.println("please pay your taka");
        int pay=ob.nextInt();
        if(pay==add){
            System.out.println("your paymeant complete");
        } else if (add>pay) {
            System.out.println("you have to clear"+(add-pay));
           // double add2=add-pay;
        }
       else
            System.out.println("here is your change"+(pay-add));

    }
}
