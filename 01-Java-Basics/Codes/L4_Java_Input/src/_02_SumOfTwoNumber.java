import java.util.Scanner;

public class _02_SumOfTwoNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input First number : ");
        int num1 = input.nextInt();

        System.out.println("Input Second number : ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum is : " + sum);
    }
}
