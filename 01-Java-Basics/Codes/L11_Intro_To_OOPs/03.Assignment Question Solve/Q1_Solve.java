/*Q1. Create a class named 'Student1' with String variable 'name'
  and integer variable 'roll_no'. Assign the value of roll_no as '2'
  and that of name as "John" by creating an object of the class Student1.*/

 class Student{
     String name;
     int rollNo;

 }

 public class Q1_Solve {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.name = "John";
        Student1.rollNo = 2;

        System.out.println(Student1.name);
        System.out.println(Student1.rollNo);


    }
 }
