import java.util.Scanner;

public class _06_Switch_Statement {
    public static void main(String[] args) {
        /*Switch Case
         * Syntax:
         * switch(Expression/variable){
         * case 1: //code; break;
         * case 2: //code; break;
         * case 3: //code; break;
         * case 'x': //code; break;
         * case 'y': //code; break;
         * case 'z': //code; break;
         * default : //code;
         * }
         * */

        //Example
        /*Write a program to print the day name based upon the day number.*/
        Scanner sc = new Scanner(System.in);
        int dayNum = sc.nextInt();
        switch (dayNum) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid number entered");
        }
    }
}
