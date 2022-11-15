public class _02_Triangular_Patterns {
    public static void main(String[] args) {

        /*Triangular pattern*/

        /*Problem 1 : Given n, print a triangular pattern
                      as shown in the example below.
                        Example if n=4
                        Print:
                          *
                          * *
                          * * *
                          * * * *
        */
        //Solve:

/*
        //method1
        int n = 4;
        for(int line = 1; line <= n; line++){
            for (int star=1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }

 */
        //method2
/*
        int n = 4;
        for(int r=1; r<=n; r++){
            for(int star=1; star<=r; star++){
                System.out.print("*");
            }
            System.out.println();

        }
*/




        /*Problem 2 : Given n, print a triangular pattern
                      as shown in the example below.
                        Example if n=4
                        Print:
                          * * * *
                          * * *
                          * *
                          *
        */
        //Solve:
/*
        int n =4;
        for(int r = 1; r<=n; r++){
            for(int c = 1; c<=n-r+1; c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

*/


        /*Problem  Print a triangular pattern as shown
           in the example below.
           Example for n=4*/
/*
         int n= 4;
         for(int r = 1; r<=n; r++){
             //Print (n-r) spaces
             for(int space = 1; space <=n-r; space++){
                 System.out.print(" ");
             }
             //Print (2*r-1) spaces
             for(int star = 1; star <=2*r-1; star++){
                 System.out.print("*");
             }

             System.out.println();
         }


*/











    }
}
