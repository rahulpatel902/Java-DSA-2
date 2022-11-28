public class _01_Scope_of_variables {
    /*
     * Topic: Scope of Variables In Java
     * ----------------------------------
     * Scope of a variable is the part of the program where the variable can be
     * accessed. The various types of scopes that Java supports are as follows :
     * (1). Member Variables (Class Level Scope)
     * (2). Local Variables (Method Level Scope)
     * (3). Loop Variables (Block Scope)
     * */

    public static class Class_Level_Scope {
        /*-----------------------------------------
         * 1. Member Variables (Class Level Scope)
         * ------------------------------------------
         * => These are the variables that are declared inside the class
         * => These variables can be Declared anywhere in class, but
         *    outside methods.
         * => Java allows us to access member variables outside the class with
         *    the access modifier rules:[will be taught in oops classes]
         */
        //Example :

        int a = 10; //Declared Member Variables 1
        int b = 5; // Declared Member Variables 2

        int add() {
            return a + b; //Using member variable inside add() method but inside class
        }

    }

    public static class Method_Level_Scope {
        /*---------------------------------------
         * 2.Local Variables (Method Level Scope
         * ----------------------------------------
         *=> Variables declared inside a pair of curly braces {} have block-level scope
         *=> Variables declared inside a method have method level scope
         *=> These variables can’t be accessed outside the method
         *=> These variables don’t exist after the method's execution is over.
         */
        //Example:

        int add() { //Method 1 -> add()
            int a = 5; //Methode 1 variable
            int b = 5; //Methode 1 variable
            return a + b; //
        }

        void printSum() { // Method 2 -> printSum()
            //int sum = a + b;
            // variable ^ a & b from methode add() can't be accessed in this method
            // because of the METHODE SCOPE of variable a & b;
            // a & b can't be accessed outside add() method
        }
    }

    /*--------------------------------------
     * 3. Loop Variables (Block Level Scope)
     * --------------------------------------
     * =>A variable declared inside a pair of brackets "{" and "}" in a
     *    method has scope within the brackets only.
     * => A Block of code may exist own its own {...Code...}
     * -----------------------------------------------------------------------
     * Note : Within the same scope, no two variables can be declared with the
     * same name. However, it is possible for two variables to have the
     * same name if they are declared in different scope.
     * ------------------------------------------------------------------------
     */
    //Example:

    public static class Block_Level_Scope {
        int $ = 5;              //Class Level Scope -> $ variable

        void print() {            //Method level Scope -> a variable
            int a = 10;
            System.out.println(a);
            {
                int b = 30;     //Block Level Scope -> b Variable
                System.out.println(b); // b can only be accessed inside the same block
            }
            // System.out.println(b); //error
            // b variable can't be accessed in method level scope
            // because b is declared in block level scope
            // b can only be accessed inside the same block

            {
                int b = 100; // new b variable in a new block
                System.out.println(b); //100
            }
        }
    }

    public static void main(String[] args) {
        Block_Level_Scope obj = new Block_Level_Scope();
        obj.print();
    }
}


