public class _07_Using_labes_with_Continue_and_Break_statement {

    public static void main(String[] args) {

        /*Using labels with continue and break  keywords*/
        /* We can also label a specific loop, just as we name a
         * variable, and then use the continue or break statement
         * to apply continue/break on the specific loop.*/


//      Example01:
        myloop: for(int i = 1; i<=100; i++){
            if(i%3==0){
                continue myloop;
            }
            else{
                System.out.println(i);
            }
        }

//      Example02:
        outer: for(int i =0; i<10; i++){
            inner: for(int j =0; j<5; j++){
                break outer;
            }
        }










    }
}
