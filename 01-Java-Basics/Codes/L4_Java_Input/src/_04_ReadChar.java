import java.util.Scanner;

public class _04_ReadChar {
    public static void main(String[] args) {

/*
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Character : ");
        char ch = input.next().charAt(2);
        System.out.println("Character is : " + ch);


        Scanner sc = new Scanner(System.in);



        String q = sc.next();
        int p = sc.nextInt();

        System.out.print(q+" "+p);

*/
/*
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();

 */

        Scanner userInput = new Scanner(System.in);
        System.out.println ("How old are you?");
        int age = userInput.nextInt();
        System.out.println (age + " is a very good age to be!");
    }


}
