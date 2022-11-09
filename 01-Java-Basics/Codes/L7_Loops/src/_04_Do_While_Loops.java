import java.util.Scanner;

public class _04_Do_While_Loops {
    public static void main(String[] args) {
        /*Do While Loops
        * Syntax:
        * ------
        * do {
        *   statement;
        * } while (condition);
        * --------------------
        * */



        //Example:
        /*Q1-Print the sum of the first 10 natural
           numbers using do while loop.*/
        //Solve:
/*

        int num = 1;
        int n = 10;
        int sum = 0;
        do{
            sum = sum + num;
            num++;
        }while(num <= n);

        System.out.println(sum);
*/

       //Example question
        //Q2- it will run ones even if the condition is not true
//        int idx = 15;
//        do {
//            System.out.print(idx + " ");  // it only runs once
//        } while (idx < 5); // because here condition is false

        /*Q3-Print the sum of the stream of integer in the input  .*/
        //Solve:
        Scanner input = new Scanner(System.in);
/*
        int num = 0;
        int sum = 0;
        while (num!=-1){
                sum = sum + num;
                System.out.println("Enter Number: ");
                num = input.nextInt();
        }

        System.out.println(sum);
*/

        //Do - While Loop
/*
        int num = 0;
        int sum = 0;
        do {
                sum = sum + num;
                System.out.println("Enter Number: ");
                num = input.nextInt();
        }while (num!=-1);

        System.out.println(sum);
*/
      /// while loop + break statement
/*
        int num = 0;
        int sum = 0;
        while (true){
            if(num!=-1){
                sum = sum + num;
                System.out.println("Enter Number: ");
                num = input.nextInt();
            }
            else{
                break;
            }

        }
        System.out.println(sum);
*/

    }
}
