

public class _06_Continue_Statement {
    public static void main(String[] args) {

        //Continue Statement
        /*
        * Continue keyword is used to end the current iteration
        * in a for loop (or a while loop), and continues to the next
        * iteration.It can be used in cases where we want
        * the remaining block of code to get executed
        * in the loop for the specific iteration.
        * */

        //Questions Example
        /*Q1- Print all values between 1 and 100, except if it’s a
              multiple of 3.*/

        for(int i = 1; i<=100; i++){
            if(i%3==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }


        /*2- Print all factors of the number in the input.*/










    }
}
