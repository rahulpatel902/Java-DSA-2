public class _05_Access_Attribute_Method_of_Class_by_Object {

    //Created Class Person
    public static class Person{
        int age = 19;
    }
    public static void main(String[] args) {
        //Created Class Person -> Object
        Person Rahul = new Person();

        //Topic: Access Attributes and Methods of a class through objects

        //Syntax: to Access Attributes and Methods
        // [ ObjectName.AttributeName ]
        // [ ObjectName.MethodeName ]

        //Q1-Access Class Person attribute/methode through objects
        //Solve:

        System.out.println(Rahul.age);

    }
}
