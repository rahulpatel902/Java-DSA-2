import java.util.Scanner;

public class _09_Questions_to_do_again {
    public static void main(String[] args) {
        //Q1 if n=4
        // ****
        // ***
        // **
        // *

/*
        int n = 4;
        for(int r = 1; r<=n; r++){
            for(int star = 1; star<=(n-r+1); star++){
                System.out.print("*");
            }
            System.out.println();
        }
*/
        //Q2  row=4,col=6
        // 123456
        // 1    6
        // 1    6
        // 123456
/*
        int row = 4, col = 6;
        for(int r = 1; r <= row; r++){
            for(int n1 = 1; n1 <= col; n1++){
                if(r==1||r==row||n1==1||n1==col){
                    System.out.print(n1);
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
*/
        //Q3
//          *   *
//           * *
//            *
//           * *
//          *   *
        // Solve:
/*
        int n = 5;
        for(int r  = 1; r <= n; r++){
            for(int s = 1; s <= n; s++){
                if(r==s||r+s==n+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
*/
        //Q4 enter number till user wants
/*
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        while(in.hasNextInt()){
            System.out.println("Enter Number: ");
            num = in.nextInt();
            if(num>=0){
                sum = sum + num;

            }
            else if(num=='A'){
                break;
            }
            else{
                sum = -1;
                break;
            }
        }
        System.out.println("Your sum : " + sum);

*/












    }
}
