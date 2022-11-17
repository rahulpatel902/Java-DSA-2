import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class _02_Conversion_of_Binary_to_Decimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int binary_num = input.nextInt();

        int ans = 0; // Converted to decimal number
        int pw = 1; //2 ^ 0 = 1 #variable pw = pw of 2

        while(binary_num > 0){

            int unit_Digit = binary_num % 10; //unit_Digit = Last Digit of Binary_Num
            ans = ans + (unit_Digit * pw);  // ans will store [last digit * pw] // Updating the unit Digit
            binary_num = binary_num / 10;   //Increasing the power of two
            pw = pw * 2;

        }

        System.out.println(ans);




    }
}
