import java.util.Scanner;

public class _03_Conversion_of_to_Decimal_Binary {
    public static void main(String[] args) {

        /*Decimal To Binary*/

        Scanner input = new Scanner(System.in);

        int decimal_Num = input.nextInt(); //Decimal Number
        int ans = 0;
        int pw = 1; // Power of (10^0)

        while(decimal_Num > 0){
            int parity = decimal_Num % 2;
            ans = ans + (parity * pw);
            pw = pw * 10;
            decimal_Num = decimal_Num / 2;
        }
        System.out.println(ans);
    }
}
