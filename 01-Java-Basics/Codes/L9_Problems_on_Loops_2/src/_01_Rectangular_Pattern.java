public class _01_Rectangular_Pattern {

    public static void main(String[] args) {

        /*Problems on Rectangular Patterns*/

        /*Q1-Given height h and width w, print a rectangular pattern
        *    as shown in the example below.
        *          -> Height(h) = rows(r)
        *          -> width(w) = column(c)
        *    Given h=r=3, w=c=6
        *    print:
        *            ******
        *            ******
        *            ******
        */
        //Q1-Solve:
/*
        int r = 3, c=6;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

        /*Q2-Given height h and width w, print a rectangular
         *    pattern as shown in the example below.
         *          -> Height(h) = rows(r)
         *          -> width(w) = column(c)
         *    Given h=r=4, w=c=6
         *    print:
         *            ******
         *            *    *
         *            *    *
         *            ******
         */
        //Q2-Solve:
/*

        int r = 4, c = 6;

        for(int line=1; line<=r; line++){
            for(int star=1; star<=c; star++){
                if(line==1||line==r||star==1||star==c){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/

        /*Q3-Given height h and width w, print a rectangular pattern as
         *    shown in the example below.
         *          -> Height(h) = rows(r)
         *          -> width(w) = column(c)
         *    Given h=r=4, w=c=6
         *    print:
         *         *.*.*.
                   .*.*.*
                   *.*.*.
                   .*.*.*
         */
        //Q3-Solve:
 /*       int r = 4, c = 6;
        for (int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                if((i==1||i==3)&&j%2!=0){
                    System.out.print("*");
                }
                else if((i==1||i==3)&&j%2==0){
                    System.out.print(".");
                }
                else if((i==2||i==4)&&j%2!=0){
                    System.out.print(".");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }


*/

















    }
}
