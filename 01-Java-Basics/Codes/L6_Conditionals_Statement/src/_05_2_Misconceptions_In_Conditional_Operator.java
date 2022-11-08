public class _05_2_Misconceptions_In_Conditional_Operator {
    public static void main(String[] args) {


        /*Common Misconceptions*/
        /*
        *1. "&" vs "&&"
        *bitwise - logical AND
        *
        *
        *
        *2. "|" vs "||"
        *bitwise - logical OR
         */

        //Question
        //1. Print the value if it is even and divisible by 3
        //Solve
//        int num = 4;
//        if(num%2==0 && num%3==0){
//            System.out.println(num);
//        }
//        else{
//            System.out.println("Odd number & boe divisible by 3");
//        }


        //Question
        //2. Print the value if it is divisible by 3 or 5
        //Solve
        int num = 8;
        if (num%3==0 || num%5==0){
            System.out.println(num);
        }


    }
}
