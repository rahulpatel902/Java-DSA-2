public class _07_Problems_on_Loops_1 {
    public static void main(String[] args) {

               /*{ Problems on Loops 1 }*/

                  /*[Digits Problems]*/
        // 01: Count the number of digits in the given number n.
/*        int n = 132;
        int i;
        for(i = 0; n>0; i++){
            n = n/10;
        }
        System.out.println(i);

        while(n>0){
            n = n/10;
            i++;
        }
        System.out.println(i);*/

        //02: Find the sum of digits in a given number n.
/*
        int n = 132;
        int sum = 0;
        for(int i = 1; n > 0; i++){
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
*/
        //03: Reverse the digits of a number.
/*
        int n = 132;
        int rev = 0;
        for(int i = 1; n > 0; i++){
            int ld = n % 10;
            n = n / 10;
            rev = (rev * 10) + ld ;
        }
        System.out.println(rev);
*/

                   /*[Maths Problems]*/
        //Problem 1: Find the sum of the following series
        // 1 - 2 + 3 - 4 … n
/*
        int n = 4;
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2!=0){
                sum = sum + i;
            }
            else{
                sum = sum - i;
            }
        }
        System.out.println(sum);
*/

        //03: Print the nth factorial number
/*
        int n = 5;
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact * i;
            System.out.println(fact);
        }

*/
        //02: Given 2 numbers a and b. Find a raise to the power b.
/*
        int a = 2 , b = 4;
        int product = 1;
        for (int i = 1; i <= b; i++){
            product = product * a;
        }
        System.out.println(product);

*/
/*
        int i=1, j=1;
        while(i<3)
        {
            do
            {
                System.out.print(j + ",");
                j++;
            }while(j<4);
            i++;
        }


*/












    }

}
