import java.util.Scanner;

public class _05_Assignment_Questions {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //Q1 - Write a program to print Fibonacci series of
        //     n terms where n is input by user.
        //Solve:


        //Q2 Write a program to enter the numbers till the user wants,the
        //   number can be positive,negative or zero. Calculate the
        //   sum of numbers until a negative number is encountered.
        //   If the input is a negative number, current sum is
        //   discarded and print -1.
        //   Solve:
/*
        int sum = 0;
        while(scn.hasNextInt()){ //check if input exists or not
            int num = scn.nextInt();
            if(num >= 0){ //if input is positive or zero add it to the current sum
                sum += num;
            }
            else{
                sum = -1;//input is negative so change sum to -1 and break out of the loop
                break;
            }
        }
        System.out.print(sum);

*/
        //Q3: Write a program to calculate the factorial of a number.
        //Solve:
/*
        System.out.print("Enter a Number: ");
       int n = scn.nextInt();
        int fact = 1;
        for(int i = 1; i<= n; i++){
             fact = fact * i;
        }
        System.out.println("Fact of " + n + " is: " + fact);
 */
        //Q4- Write a program to print all Armstrong numbers between 1 to n. (Medium)
        //Explanation:
        // A three digits number is called the Armstrong number if the
        // sum of the cube of its digit is equal to the number itself.
        // E.g.- 153 is an Armstrong number because
        // (1^3)+(5^3)+(3^3) = 153.

        //Q5 – Write a program to print the cross pattern given
        //     below (in the shape of X): (Medium)
        //  *   *
        //   * *
        //    *
        //   * *
        //  *   *
        //Solve:
/*
        int size = 5; //length of pattern
        for(int r = 1; r <= size; r++){
            for(int c = 1; c <= size; c++){
                if(r == c || r+c == size+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/

        //Q6- Write a program to print alphabet diamond pattern: (Hard)
        //Print:
        //      A
        //     ABC
        //    ABCDE
        //   ABCDEFG
        //  ABCDEFGHI
        //   ABCDEFG
        //    ABCDE
        //     ABC
        //      A
        //Solve:
/*
        int n = 7;
        char le = 'A';
        int r, s, l;

        for (r = 1; r <= n; r++) {
            for (s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (l = 1; l <= 2 * r - 1; l++) {
                System.out.print(le);
                le++;
            }
            le = 'A';
            System.out.println();
        }
        for (r = n - 1; r >= 1; r--) {
            for (s = 1; s <= n - r; s++) {
                System.out.print(" ");
            }
            for (l = 2 * r - 1; l >= 1; l--) {
                System.out.print(le);
                le++;
            }
            le = 'A';
            System.out.println();
        }
*/
        //Q7- Write a program to print pattern given below :
        //     *
        //     *
        //   *****
        //     *
        //     *
/*
        int n = 5;
        for(int r = 0; r<n; r++){
            for(int space = 0; space<n; space++){
                if(r==n/2||space==n/2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
*/
        //Q8 - Write a program to print a triangle of prime numbers
        //     upto given number of lines of the trinagle.
        //Input: line = r = n =  6;
        //Output:
        //       2
        //      3 5
        //    7 11 13
        //   17 19 23 29
        //  31 37 41 43 47
        // 53 59 61 67 71 73
/*//Wrong
        int n = 6;
        int p = 1;
        for(int r=1; r<=n; r++){
            for(int s=1; s<=n-r; s++){
                System.out.print(" ");
            }
            for(int n1 = 1; n1 <=2*r; n1++){
                if(p%n1+1==1){
                    System.out.print(p);
                }
                p++;
            }
            System.out.println();
        }

*/
        //Q9- Write a program to check whether a prime Number can
        //     be expressed as a Sum of Two Prime Numbers.
        // Can't do



        //Q10 - You are given n number of bulbs. They are all switched off.
        //      A weird fluctuation in voltage hits the
        //      circuit n times. In the 1st fluctuation all bulbs are toggled,
        //      in the 2nd fluctuation every 2nd bulb is toggled,in the 3rd fluctuation
        //      every 3rd bulb is toggled and so on. You've to find which bulbs
        //      will be switched on after n fluctuations.
        //   // Take as input a number n, representing the number of bulbs.
        //   // Print all the bulbs that will be on after the
        //      nth fluctuation in voltage.
        //Solve:Wrong
        int n = 10;
        int nt = 3;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0 || j % 3 == 0) {
                System.out.print(j);
            }
        }
        System.out.println();


    }
}

