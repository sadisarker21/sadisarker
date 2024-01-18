class fpi {
    public static void main(String[] args) {
        int i, j, k, e;
        int n = 4;
        for (i = 1; i <= n; i++) {

            //inner star print
            for (j=1;j<=i;j++) {
                System.out.print(" ");
            }
            //inner space print
            for (j = 1; j <= n-i; j++)
            {
                System.out.print("*");
            }


            System.out.println();
            }
        }
    }

