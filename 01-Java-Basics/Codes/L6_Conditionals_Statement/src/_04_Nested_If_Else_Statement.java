public class _04_Nested_If_Else_Statement {
    public static void main(String[] args) {
        /* If-Else Statement
        * Syntax:
        * if (Condition 1){
        *    if(Condition 2){
        *       //Code
        *    }
        *    else{
        *       //Code
        *    }
        * }
        * else{
        *   //Code
        * }
        */

        // Example

        int age = 4;

        if(age<=12){
           if(age>5){
               System.out.println("Child");
           }
           else{
                System.out.println("Toddler");
           }
        }

    }

}
