import java.util.Scanner;

public class _04_Numerical_Triangular_Pattern {
    public static void main(String[] args) {

        /*Problem: Given n, print a triangular pattern as shown
                   in the example below. Example if n=4
                   1
                   12
                   123
                   1234
         */
        //Solve:
/*
        int n =4;
        for(int r =1; r<=n; r++){
            for(int c =1; c<=r; c++){
                System.out.print(c);
            }
            System.out.println();
        }
*/

        /*Problem 1: Given n, print a triangular pattern as
                    shown in the example below.
                    Example if n=4
                           1
                          121
                         12321
                        1234321
        */


/*
        int n = 5;
        for(int r = 1; r<=n; r++){
            // print 1 to n-r spaces
            for(int space = 1; space<=n-r; space++){
                System.out.print(" ");
            }
            //print 1 to r number
            for(int num1 = 1; num1<=r; num1++){
                System.out.print(num1);
            }
            //print r-1 to 1
            for(int num2 = (r-1); num2>=1; num2--){
                System.out.print(num2);
            }
            System.out.println();
        }
*/

/*        Problem 2 Given n, print a triangular pattern as
                     shown in the example below.
                     Example if n=4
                  ___1
                  __2 2
                  _3   3
                  4444444
*/


        int n = 5;
        for(int r = 1; r<=n; r++){
            //print 1 to n-r spaces
            for(int space = 1; space<=n-r; space++){
                System.out.print(" ");
            }
            //print 1 to 2*r-1 number
            for(int n1 = 1; n1<=2*r-1; n1++){
                if(n1==1||n1==2*r-1||r==n){
                    System.out.print(r);
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }





    }
}
