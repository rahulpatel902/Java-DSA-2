public class _01_Java_Operators {
    public static void main(String[] args) {
/*

        //01-Arithmetic Operator
        // [+, -, *, /, %]
        //Example:
        int a = 20, b = 10;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        //02-Relational Operator
        // [==, !=, >, <, >=, <=]
        //Example:
        int c = 10, d =15;

        System.out.println(c == d);//f
        System.out.println(c != d);//t
        System.out.println(c >= d);//f
        System.out.println(c <= d);//t
        System.out.println(c > d);//f
        System.out.println(c < d);//t

        //03-Logical Operator
        // [&&, !, ||]
        //Example:
        int p = 15, q = 10, r = 5;
        //1st- AND [&&] Operator
        System.out.println((p > q) && (p > r));//true
        System.out.println((p > q) && (p < r));//false

        //2st- OR [||] Operator
        System.out.println((p > q) || (p > r));//true
        System.out.println((p > q) || (p < r));//true
        System.out.println((p < q) || (p < r));//false
        System.out.println((p < q) || (p > r));//true

        //3rd- NOT [!] Operator
        System.out.println(!(p > r));
        System.out.println(!(p < r));

        //04th Assignment Operator
        // [=, +=, -=, *=, /=, %=]
        //Example:
        int x =10;
        int z;

        // =
        z = x;
        System.out.println(z);//10

        // +=
        x += z;
        System.out.println(x);//20

        // -=
        x -= z; // x = x-z;
        System.out.println(x);//10

        // *=
        x *= z; // x = x*z;
        System.out.println(x);//100

        // /=
        x /= z; // x = x/z;
        System.out.println(x);//10

        // %=
        x %= z; // x = x%z;
        System.out.println(x);//0

        //05th Unary Operator
        // [+, -, ++, --, !]
        //Example:

        int t = 5, y = 5;

        System.out.println(t++);//5
        System.out.println(t);//6

        System.out.println(++y);//6
        System.out.println(y);//6

        int o = t++;//6
        int l = ++y;//7

        System.out.println(o);//6
        System.out.println(l);//7

        System.out.println(t);//7
        System.out.println(y);//7
*/
/*        // MCQ 1
        int p = 4, q = 3, r = 2;
        int s;
        s = p - ++r - ++q;
        System.out.println(s);

        // MCQ 2
        System.out.println(4+2+"pqr");
        System.out.println("pqr"+4+2);

        // MCQ 3
        boolean f = false;
        boolean g = false;
        boolean v = true;
        System.out.println(f==g==v);
 */
        // MCQ 4
//        int a = 10;
//        int b = 15;
//        a++;
//        b--;
//        int c = b % a;
//        System.out.println(c >= b);


        // MCQ 5
//        int x = y = z = 10;
//        System.out.println(x + " " + y + " " + z);

        //MCQ 6
        int i=19, j=29, k;
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);





    }
}
