//Example 2. Java Program to add two numbers using methods

/*  //Using Static
class Static {
    public static int addTwoNumber(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println(addTwoNumber(a, b));
    }
}
*/

//Not Using Static -> but by Creating an object of class
class NotStatic {
    public int addTwoNumber(int a, int b) {
        return a + b;
    }
}

public class _04_Example_Question {
    public static void main(String[] args) {
        int a = 40, b = 60;

        //Creating an object of class _04_Example_Question
        NotStatic obj = new NotStatic();

        //Calling method
        int answer = obj.addTwoNumber(a, b);
        System.out.println(answer);
    }


}