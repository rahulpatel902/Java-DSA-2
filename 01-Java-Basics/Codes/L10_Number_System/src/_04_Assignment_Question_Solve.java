import java.util.Scanner;

public class _04_Assignment_Question_Solve {
    public static void main(String[] args) {

        // Q3 - Add two numbers given in different base
        // Input : 1st number is decimal , 2nd num in binary
        // Output : in Decimal number
/*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");
        int decimal_Num = input.nextInt();

        System.out.print("Enter a Binary Number: ");
        int binary_Num = input.nextInt();

        int ans = 0;
        int pw = 1; // Power of 2 (2^0=1)

        while (binary_Num > 0){
            int last_Digit = binary_Num % 10;
            ans = ans + (last_Digit * pw);
            binary_Num= binary_Num / 10;
            pw = pw * 2;
        }

        System.out.println("Sum of both in Decimal : " + (decimal_Num + ans));
*/

        // Q4 - Multiply two numbers given in different base
        // Input : 1st number is decimal , 2nd num in binary
        // Output : in Decimal number
/*
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");
        int decimal_Num = input.nextInt();

        System.out.print("Enter a Binary Number: ");
        int binary_Num = input.nextInt();

        int ans = 0;
        int pw = 1; // Power of 2 (2^0=1)

        while (binary_Num > 0){
            int last_Digit = binary_Num % 10;
            ans = ans + (last_Digit * pw);
            binary_Num= binary_Num / 10;
            pw = pw * 2;
        }
        System.out.println("Sum of both in Decimal : " + (decimal_Num * ans));
*/

        /*Q5 - Convert a decimal double number into binary string
               for up-to k precision digits*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Decimal Number: ");
        double decimal_Num = input.nextDouble();
        System.out.print("K: ");
        int k = input.nextInt();

        double ans = 0;
        double pw = 1; // power of 10 (10^0)

        while (decimal_Num > 0){

            double parity = decimal_Num % 2;
            ans = ans  + (parity * pw);
            pw = pw * 10;
            decimal_Num = decimal_Num / 2;
        }
        String bi = Double.toString(ans);

        System.out.println(bi);


























    }
}
