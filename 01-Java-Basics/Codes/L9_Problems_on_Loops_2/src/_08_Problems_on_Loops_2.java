public class _08_Problems_on_Loops_2 {
    public static void main(String[] args) {

              /*{ Problems On loops 2 }*/

              /*[ Rectangular Pattern ]*/
        // 01: Given height h and width w, print a rectangular pattern as
        //     shown in the example below.
        //     Example: h=3,w=6
        // Print:
        // ******
        // ******
        // ******
        //Solve:
/*      int h=3,w=6;
        for(int r = 1; r<=h; r++){
            for(int c = 1; c<=w; c++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //02: Given height h and width w, print a rectangular
        //     pattern as shown in the example below.
        //     Example: h=4,w=6
        //Print:
        // ******
        // *    *
        // *    *
        // ******
/*
        int h=10,w=20;
        for(int r = 1; r <= h; r++){
            for(int c = 1; c <= w; c++){
                if(r==1||r==h||c==1||c==w){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/

        // 3 : Given height h and width w, print a rectangular
        //     pattern as shown in the example below.
        //    Example: h=4,w=6
        // Print:
        // *.*.*.
        // .*.*.*
        // *.*.*.
        // .*.*.*
        //Solve:
        //Method 01:
/*
        int h=4,w=6;
        for(int r = 1; r<=h; r++){
            for(int c = 1; c<=w; c++){
                if((r+c)%2==0){
                    System.out.print("*");
                }
                else{
                    System.out.print(".");
                }
            }
            System.out.println();
        }
*/

/*      //Method 02:
        int h=4,w=6;
        for(int r = 1; r <= h; r++){
            for(int c = 1; c <= w; c++){
                if((r==1||r==3) && c%2==0){
                    System.out.print(".");
                }
                else if((r==2||r==4) && c%2!=0){
                    System.out.print(".");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }

*/
                   /*[ Triangular Pattern ]*/
        //01 : Given n, print a triangular pattern as shown
        //            in the example below.
        //            Example if n=4
        //Print:
        // *
        // **
        // ***
        // ****
        //Solve:
/*
        int n = 4;
        for(int r = 1; r <= n; r++){
            for(int c = 1; c <= r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //Problem 2 : Given n, print a triangular pattern as
        //            shown in the example below.
        //Example if n=4
        //Print:
        // ****
        // ***
        // **
        // *
        //Solve:

        //Method 01
/*
        int n = 4;
        for(int r = 1; r<=n; r++){
            for(int c=1; c<=(n+1-r); c++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
/*
        //Method 02
        int n = 4;
        for(int r = 4; r>=1; r--){
            for(int c=1; c<=r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //Method 03
/*
        int n = 4;
        for(int r = n; r >= 1; r--){
            for(int c = 1; c<=r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //Problem 1 Print a triangular pattern as shown in the
        // example below.
        //Example for n=4
        //Print:
        //    *
        //   ***
        //  *****
        // *******
/*
        int n = 4;
        for(int r = 1; r<=n; r++){
            for(int space = 1; space <= (n-r); space++){
                System.out.print(" ");
            }
            for(int star = 1; star <= (2*r-1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //01: Given n, print a rectangular pattern as shown i
        //    n the example below.
        //    Example if n=7
        //Print:
        //1 2 3 4 5 6 7
        //2 3 4 5 6 7 1
        //3 4 5 6 7 1 2
        //4 5 6 7 1 2 3
        //5 6 7 1 2 3 4
        //6 7 1 2 3 4 5
        //7 1 2 3 4 5 6

/*
        int n = 7;
        for(int r = 1; r <= n; r++){
            for(int n1 = r; n1 <= n; n1++){
                System.out.print(n1);
            }
            for(int n2 = 1; n2 <= (r-1); n2++){
                System.out.print(n2);
            }
            System.out.println();
        }
*/
        // 01: Print a rectangular pattern as shown in the
        // example below.
        // Example if row=4,col=6
        // Print:
        // 123456
        // 123456
        // 123456
        // 123456
        //Solve:
/*
        int row=4,col=6;
        for(int r = 1; r <= row; r++){
            for(int c = 1; c <= col; c++){
                System.out.print(c);
            }
            System.out.println();
        }
*/
        //02: Print a rectangular pattern as shown in the example below.
        //    Example if row=4,col=6
        //Print:
        // 123456
        // 1    6
        // 1    6
        // 123456
        //solve:
/*
        int row=4,col=6;
        for(int r = 1; r<=row; r++){
            for(int c = 1; c<=col; c++){
                if(r==1||r==row||c==1||c==col){
                    System.out.print(c);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/
        //03 : Given n, print a rectangular pattern as
        //     shown in the example below.
        //     Example if rows=4,col=6
        //Print:
        // 121212
        // 212121
        // 121212
        // 212121
        //Solve:
/*
        int rows=4,col=6;
        for(int r = 1; r<=rows; r++){
            for(int c = 1; c <= col; c++){
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
              /*[Numerical Triangular pattern]*/

        //01: Given n, print a triangular pattern as
        //    shown in the example below.
        //Example if n=4
        //Print:
        // 1
        // 12
        // 123
        // 1234
        // Solve:

/*
        int n = 4;
        for(int r = 1; r<=n; r++){
            for(int c = 1; c<=r; c++){
                System.out.print(c);
            }
            System.out.println();
        }
*/
        //02: Given n, print a triangular pattern as
        //    shown in the example below.
        //    Example if n=4
        //Print
        //    1
        //   121
        //  12321
        // 1234321
        //Solve:

/*        int n = 4;
        for(int r = 1; r <= n; r++){
            for(int space = 1; space <= n-r; space++){
                System.out.print(" ");
            }
            for(int n1 = 1; n1<=r; n1++){
                System.out.print(n1);
            }
            for(int n2 = r-1; n2 >= 1; n2--){
                System.out.print(n2);
            }
            System.out.println();
        }*/

        //03 Given n, print a triangular pattern as shown
        //   in the example below. Example if n=4
        //Print:
        //    1
        //   2 2
        //  3   3
        // 4     4

/*
        int n = 4;
        for(int r=1; r<=n; r++){
            for(int space = 1; space<=n-r; space++){
                System.out.print(" ");
            }
            for(int n1= 1; n1<=2*r-1; n1++){
                if(n1==1||n1==2*r-1){
                    System.out.print(r);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            }
*/
        //04 Given n, print a triangular pattern as shown
        //   in the example below. Example if n=4
        //Print:
        //    1
        //   2 2
        //  3   3
        // 4444444
/*
        int n = 4;
        for(int r = 1; r<=n; r++){
            for(int space = 1; space <= n-r; space++){
                System.out.print(" ");
            }
            for(int n1 = 1; n1<=2*r-1; n1++){
                if(n1==1||n1==2*r-1||r==n){
                    System.out.print(r);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

*/





















    }
}
