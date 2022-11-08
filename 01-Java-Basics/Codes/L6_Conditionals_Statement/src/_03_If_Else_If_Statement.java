public class _03_If_Else_If_Statement {
    public static void main(String[] args) {
        /* If-Else Statement
        * Syntax:
        * if (Condition 1){
        *   //Code
        * }
        * else if(Condition 2){
        *   //Code
        * }
        * else{
        *   //Code
        * }
        */

        // Example
        int age = 15;
        if (age >= 18){
            System.out.println("Adult");
        }
        else if (age >= 12 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }

}
