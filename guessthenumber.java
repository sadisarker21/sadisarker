import java.util.Scanner;

public class guessthenumber {
    public static void main(String[] args) {
        Scanner OB=new Scanner(System.in);
        int finalnumber= 20;
        int guessnumber=OB.nextInt()   ;
        if(guessnumber==finalnumber){
            System.out.println("you are right");
        } else if (guessnumber<finalnumber) {
            System.out.println("this is small");

        } else if (guessnumber>finalnumber) {
            System.out.println("this  is big ");

        }
    }
}
