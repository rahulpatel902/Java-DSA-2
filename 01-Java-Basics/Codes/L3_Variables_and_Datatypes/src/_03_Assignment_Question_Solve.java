public class _03_Assignment_Question_Solve {

    public static void main(String[] args) {

        /* Q1 - Take 2 integer values in two variables
               x and y and print their product */
        // Solve:
        int x = 2, y = 4;
        System.out.println("Product of x & y is : " + x * y);

        /* Q2 - Print the ASCII value of character ‘U’ */
        // Solve:
        int b = 'U';
        System.out.println("ASCII value of character ‘U’: " + b);

        /* Q3 - Write a Java program to take the length and breadth
                of a rectangle and print its area. */
        // Solve:
         int length = 7, breadth = 4;
         System.out.println("Length is : " + length);
         System.out.println("Breadth is : " + breadth);
         System.out.println("Area of Rectangle : " + (length * breadth) );

        /* Q4 - Write a Java program to calculate the cube of a number. */
        // Solve:
        int cubeOf = 4;
        System.out.println("Cube of:" + cubeOf + " is : " + (cubeOf*cubeOf*cubeOf) );

        /* Q4 - Write a Java program to swap two numbers with the
                help of a third variable. */
        // Solve:
        int num1 = 2, num2 = 3;
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 +  " & " + num2);

    }
}
