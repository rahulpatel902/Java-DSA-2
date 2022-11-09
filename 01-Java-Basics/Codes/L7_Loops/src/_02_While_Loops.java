public class _02_While_Loops {
    public static void main(String[] args) {
        /*While Loops
        * A while loop is a loop that runs through its body,
        * known asa while statement, as long as a predetermined
        * condition is evaluated as true.
        * */
        /*
        * Syntax
        * while (condition) {
        *    statement;
        * }
        * */

        //Lecture Example Questions:
        //Q1-Print the first n natural numbers.
/*
        int n = 10;
        int i = 1;
        while(i <= n){
            System.out.println(count);
            count ++;
        }
*/

        /*Q2-Print the sum of the first ‘n’ natural
             numbers using a while loop, where n is the input. */
/*
        int n = 10;
        int i = 1;
        int sum = 0;
        while(i <= n){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
*/

        /* Q2-A Write a short program that prints each number from 1 to 100 on a new line.
              * For each multiple of 3, print "Fizz" instead of the number.
              * For each multiple of 5, print "Buzz" instead of the number.
              * For numbers which are multiples of both 3 and 5,
                print "FizzBuzz" instead of the number. */
        int n = 100;
        int num = 1;

        while(num<=n){

            if ((num%3==0 && num%5==0)) {
                System.out.println("FizzBuzz");
            }
            else if(num%3==0){
                System.out.println("Fizz");
            }
            else if (num%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(num);
            }
            num++;
        }




    }
}
