public class _03_Numerical_Rectangular_Pattern {
    public static void main(String[] args) {

        /* Given n, print a rectangular pattern as shown
           in the example below.
           Example if n=7
        1234567
        2345671
        3456712
        4567123
        5671234
        6712345
        7123456

     */
/*
        int n =7;

        for(int r = 1; r<=n; r++){

            for(int num1=r; num1<=n;num1++){
                System.out.print(num1);
            }
            for(int num2=1; num2<=r-1; num2++){
                System.out.print(num2);
            }
            System.out.println();

        }
*/

        /*Problem 1: Print a rectangular pattern as shown in the
                     example below. Example if row=4,col=6
                     Print:
                     123456
                     123456
                     123456
                     123456
         */
/*        int row=4, col=6;
        for(int r=1; r<=row; r++){
            for(int c=1; c<=col; c++){
                System.out.print(c);
            }
            System.out.println();
        }*/

        /*Problem 2: Print a rectangular pattern as shown in the
                     example below. Example if row=4,col=6
                     Print:
                     123456
                     1    6
                     1    6
                     123456
         */
/*
        int row=4, col=6;
        for(int r = 1; r<=row; r++){
            for(int c = 1; c<=col; c++){
                if(r==1 || r==row || c==1 || c==col){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
*/
        /* Problem 3 : Given n, print a rectangular pattern as shown in
                       the example below. Example if rows=4,col=6
                       121212
                       212121
                       121212
                       212121
         */
        //Method 1
/*
        int rows = 4, col =6;
        for(int r=1; r<=rows; r++){
            for(int c=1; c<=col; c++){
                if((r+c)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(2);
                }

            }
            System.out.println();
        }
*/

        //My Method
/*
        int rows = 4, col = 6;
        for(int r = 1; r<=rows; r++){
            for(int c = 1; c<=col; c++){
                if((r==1||r==3)&&c%2!=0){
                    System.out.print(1);
                }
                else if((r==1||r==3)&&c%2==0){
                    System.out.print(2);
                }
                else if((r==2||r==4)&&c%2!=0){
                    System.out.print(2);
                }
                else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
*/




    }
}
