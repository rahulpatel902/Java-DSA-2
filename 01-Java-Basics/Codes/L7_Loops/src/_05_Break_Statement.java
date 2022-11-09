import java.util.Scanner;

public class _05_Break_Statement {

    public static void main(String[] args) {

            /*Break Statement*/
        /* The break command allows you to terminate and exit a loop
         * ( do while / for / while ) or switch commands
         * from any point other than the logical end.
         * It can be used in cases where we want the immediate termination
         * of a loop based upon certain conditions.
         * -----------------------------------------------
         * Syntax
         * -------
         * break;
         * */

        /*Example Questions*/
        //Q1- Print the first multiple of 5 which is also a multiple of 7
        // Solve:

/*
        int num = 1;
        while (true) {
            if((num%5==0) && (num%7==0)){
                System.out.println(num);
                break;
            }
            else{
                num++;
            }
        }
*/

        //Q2- Tell if the number in the input is prime or not.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Range: ");
        int num = input.nextInt();
        for (int i = 2; i < num; i++){
            if (num%i != 0){
                System.out.println(num + " is Prime");
                break;
            }
            else{
                System.out.println(num + " is not Prime");
                break;
            }
        }



























    }
}

