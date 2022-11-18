/*Q3. Write a program to print the area of a rectangle by creating a class named 'Rectangle'
      taking the values of its length and breadth as parameters of its constructor and
      having a method named 'returnArea' which returns the area of the rectangle.
      Length and breadth of rectangle are entered through keyboard.*/

class Rectangle {
    int length;
    int breadth;
    public double rec_Area(){
        return length*breadth;
    }
    public double rec_Perimeter(){
        return 2*(length+breadth);
    }

}

public class Q3_Solve {
    public static void main(String[] args) {

        Rectangle rec1 = new Rectangle();
        rec1.length = 20;
        rec1.breadth = 25;
        System.out.println(rec1.length);
        System.out.println(rec1.breadth);
        System.out.println(rec1.rec_Area());
        System.out.println(rec1.rec_Perimeter());


    }
}
