public class lp1 {
    public static void main(String[] args) {
        int st=0;
        int end =500;
        int pl=10;
        int counter=st;
        while (counter<=end){
            System.out.print(counter+" ");
            if((counter+1)%pl==0){
                System.out.println();
            }
            counter++;

        }    }
}
