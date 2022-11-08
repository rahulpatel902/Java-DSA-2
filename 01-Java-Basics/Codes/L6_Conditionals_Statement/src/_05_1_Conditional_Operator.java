public class _05_1_Conditional_Operator {
    public static void main(String[] args) {
        /*05. Conditionals Operators
         * (1)- Logical AND Operator = [&&]
         * (2)- Logical OR Operator = [||]
         * (3)- Ternary Operator Operator = [? :] // ** Ternary operator always returns a result or output
         * */

        //1. Logical AND Operator [&&]
        //Syntax
//        if(condition - 1 && condition - 2)
//        {
//            statement;
//        }
        //Example
//        int val=8;
//        if (val > 5 && val < 10) {
//            System.out.print(val);
//        }


        //2. Logical OR Operator [||]
        //Syntax
//        if(condition - 1 || condition - 2)
//        {
//            statement;
//        }
        //Example
//        int val=8;
//        if (val > 5 || val < 10) {
//            System.out.print(val);
//        }


        //3. Ternary Operator [? :]

        //Syntax
        //[ condition ? statement - 1 : statement - 2; ]


        //Example:
        //1. Without ternary operator
//        int val=5;
//        if (val % 2 == 1)
//        {
//            System.out.println("Value entered is odd");
//        } else
//        {
//            System.out. println("Value entered is even");
//        }

        //2. With ternary operator
//        String var = val % 2 == 1 ? "Value entered is odd" : "Value entered is even";
//        System.out.println(var);

        //Question on ternary operator

        /*
         * 1. Write a short program that gives the following as output -
         * For each multiple of 3, print "Fizz" instead of the number.
         * For each multiple of 5, print "Buzz" instead of the number.
         * For numbers which are multiples of both 3 and 5, print "FizzBuzz" instead of the number.
         * Otherwise, print the number itself.
         * */
        //Solve:
//        int num = 10;
//        if(num % 3 == 0 && num % 5 == 0){
//            System.out.println("FizzBuzz");
//
//        } else if (num % 3 == 0) {
//            System.out.println("Fizz");
//        }
//        else if(num % 5 == 0){
//            System.out.println("Buzz");
//        }
//        else{
//            System.out.println("The Number is not the multiple of 3 and 5");
//        }

        /*2. Write a short program that prints each number from 1 to 100 on a new line,
             except if the number is a multiple of 5 or 7.*/
        //Solve:
        int num = 0;
        while (num < 100) {
            num++;
            boolean n = num % 5 == 0 || num % 7 == 0 ? true : false;
            if (n == false) {
                System.out.println(num);
            }
        }






    }
}
