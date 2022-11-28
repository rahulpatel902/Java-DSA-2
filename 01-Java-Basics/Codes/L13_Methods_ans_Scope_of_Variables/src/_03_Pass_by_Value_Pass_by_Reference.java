    /*---------------------------------------------------
     * Topic: Pass by Value and Pass by Reference in Java
     * -------------------------------------------------------------------
     * => Pass by Value and Pass by reference are the two ways by which
     *    we can pass a value through a variable in the function/method
     * --------------------------------------------------------------------
     * 1. Pass by Value:
     * => It is a process in which the function parameter values are simply
     *    copied to another variable(from actual to formal parameters).
     *    This is known as call by value
     * ---------------------------------------------------------------------
     * 2. Pass by Reference:
     * => It is a process in which the copy of reference of actual parameter
     *    is passed to the function. This is called by call by reference.
     * ----------------------------------------------------------------------
     * Note: Java is officially always pass-by-value E.g. when any variable is
     * passed to a method in Java, the value of the variable on the stack is
     * copied into a new variable inside the new method.
     * ----------------------------------------------------------------------
     * */

public class _03_Pass_by_Value_Pass_by_Reference {

    public static void changeValue(int a){
        a = 100;
        System.out.println("Inside Change value " + a);
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Before Changing value " + a);
        changeValue(a);
        System.out.println("After Changing value " + a);

    }

}
