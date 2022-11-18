//Defining a Student1 Class
 class Student1 {
    int rollNo; //field or data member or instance variable
    String StudentName;
}

public class Main {
    public static void main(String[] args) {

        Student1 obj1 = new Student1(); //creating an object of Student1 class
        obj1.rollNo = 19;
        obj1.StudentName = "Rahul";
        System.out.println(obj1.rollNo); //Accessing member through class or reference variable
        System.out.println(obj1.StudentName);

        Student1 obj2 = new Student1();
        obj2.rollNo = 20;
        obj2.StudentName = "nox";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.StudentName);

    }
}
