public class _03_For_Loops {
    public static void main(String[] args) {

        /*For Loops
        * This is the most widely used loop amongst all.
        * The advantage of a for loop is we know exactly
        * how many times the loop will execute even before the actual
        * loop starts executing.Unlike while loop, in for loop
        * we have 3 parts in the for header.
        * --------------------------------------------
        * Syntax:
        * -------
        * for (init-statement; condition; final-expression) {
        * statement
        * }
        * ---------------------------------------------------------------------
        * init-statement: This statement is used to initialize or
        * assign a starting value to a variable which may be altered
        * over the course of the loop (we will see this while solving examples).
        * It is used/referred only once at the start of the loop.
        * ---------------------------------------------------------------------
        * Condition: This condition serves as a loop control statement.
        * The loop block is executed until the condition evaluates to true.
        * ---------------------------------------------------------------------
        * Final expression: It is evaluated after each iteration of the loop.
        * It is generally to update the values of the loop variables.
        * --------------------------------------------------------------------
        * */

        /*Q1- Print the first ‘n’ natural
             numbers using a for loop, where n is the input.*/
        //Solve:
/*
        int n = 10;
        for(int i = 1; i <= 10; i++){
        System.out.println(i);
        }

*/

        /*Q2- Print the sum of the first ‘n’ natural
             numbers using a for loop, where n is the input.*/
        //Solve:
/*
        int sum = 0;
        int n = 10;
        for(int i = 1; i <= 10; i++){
            sum=sum+i;
        }
        System.out.println(sum);
*/

         /*Q1- Print the first ‘n’ natural
               numbers in reverse order using a for loop,
               where n is the input.*/
        //Solve:
/*

        int n = 10;
        for(int num = n; num >= 1; num-=2){ //num -= 2, => num = num - 2;
        System.out.println(num);
        }
*/









    }
}
