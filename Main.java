public class Main {
    public static void main(String[] args) {
        int a=12;
        int b=13;
        int c=a;
        a=b;


        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}