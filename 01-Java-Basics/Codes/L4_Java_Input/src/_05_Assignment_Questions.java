import java.util.Scanner;

public class _05_Assignment_Questions {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /*Q1 - Input name, roll number and field of interest from user and print in the
               format below : Name: xyz, Roll number: xyz, Field of interest: xyz*/
        //Solve:
        System.out.println("Enter Your Name : ");
        String name = input.nextLine();

        System.out.println("Field of Interest : ");
        String fieldOfInterest = input.nextLine();

        System.out.println("Roll Number : ");
        int rollNum = input.nextInt();


        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNum);
        System.out.println("Field of Interest: " + fieldOfInterest);



/*-Q2 - Input two different string and print them in same line. */
        //Solve:

        String text = input.nextLine();

        String text2 = input.nextLine();

        System.out.println(text + text2);


        /*Q3 - If the marks of Robert in three subjects are entered through keyboard
               (each out of 100), write a program to calculate his total marks and percentage marks*/
        //Solve:


        System.out.println("Enter Subject 1 Marks: ");
        int sub1Marks = input.nextInt();

        System.out.println("Enter Subject 2 Marks: ");
        int sub2Marks = input.nextInt();

        System.out.println("Enter Subject 3 Marks: ");
        int sub3Marks = input.nextInt();

        int totalMarks = sub1Marks + sub2Marks + sub3Marks;
        int percentage = (totalMarks/3);

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Percentage marks: " + percentage);


        /*Q4 - Given two numbers, return their sum in the following format: Int t representing
               number of test cases T lines of Two integers representing the numbers to be added*/
        //Solve:

        int a1 = input.nextInt();
        int b1 = input.nextInt();
        System.out.println(a1+b1);




        /*Q5 - Given few lines of input(number of lines unknown) where each line has two
               strings, concatenate the strings.*/
        //Solve:

        String a = input.next();
        String b = input.next();
        System.out.println(a+b);
















    }
}
