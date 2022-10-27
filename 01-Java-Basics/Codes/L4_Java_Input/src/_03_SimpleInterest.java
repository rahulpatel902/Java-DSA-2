import java.util.Scanner;

public class _03_SimpleInterest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principle : ");
        float principle = input.nextFloat();

        System.out.println("Enter rate of interest : ");
        float rateOfInterest = input.nextFloat();

        System.out.println("Enter Time : ");
        float time = input.nextFloat();

        float simpleInterest = (principle * time * rateOfInterest) / 100;

        System.out.println("Principle: " + principle);
        System.out.println("Rate of Interest: " + rateOfInterest);
        System.out.println("Time: " + time );
        System.out.println("Your Simple Interest is : " + simpleInterest);

    }
}
