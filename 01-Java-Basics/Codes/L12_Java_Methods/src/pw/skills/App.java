package pw.skills;

public class App {
    public String string1 = "I am a Public Member";

    void printFromClass() {
        System.out.println("Within Class: " + string1);
    }

    public static void main(String[] args) {
        App obj = new App();
        obj.printFromClass();
        System.out.println("Within Class: " + obj.string1);

        App2 obj3 = new App2();
        obj3.printFromOutsideClass();


    }
}

class App2 {
    void printFromOutsideClass(){
        App obj2 = new App();
        System.out.println("Within Package but Outside Class" + obj2.string1);
    }
}
