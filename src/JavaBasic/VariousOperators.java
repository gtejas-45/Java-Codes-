package JavaBasic;
import java.util.Scanner;
public class VariousOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//creating object of scanner class
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("entered first number value :" + a);
        System.out.println("entered second number value :" + b);
        System.out.println();

        //Arithmatic Operator
        System.out.println("Arithmatic operators are + _ * / %");
        System.out.println("Addition : " + (a + b));
        System.out.println("Subtraction : " + (a - b));
        System.out.println("Multiplication : " + (a * b));
        System.out.println("Division : " + (a / b));
        System.out.println("Modulo : " + (a % b));
        System.out.println();

        // Assignment operators
        System.out.println(" Arithmatic Operators ");
        int f = 7;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        System.out.println("f >>>= 1: " + (f >>>= 1));
        System.out.println();

        //relational operator
        System.out.println("== : " + (a == b));
        System.out.println("!= : " + (a != b));
        System.out.println("> : " + (a > b));
        System.out.println("< : " + (a < b));
        System.out.println(">= : " + (a >= b));
        System.out.println("<= : " + (a <= b));
        System.out.println();

        //logical Operator
        boolean x = true;
        boolean y = false;
        System.out.println("&&" + (x && y));
        System.out.println("||" + (x || y));
        System.out.println("|" + (x | y));
        System.out.println();

        //Unary Operators
        a = 5;
        System.out.println("Understanding Pre-increment and post-increment");
        // Pre-increment
        b = ++a;   // a becomes 6, then b = 6
        System.out.println("After pre-increment:");
        System.out.println("a = " + a);  // 6
        System.out.println("b = " + b);  // 6

        // Resetting a
        a = 5;

        // Post-increment
        b = a++;   // b = 5, then a becomes 6
        System.out.println("\nAfter post-increment:");
        System.out.println("a = " + a);  // 6
        System.out.println("b = " + b);  // 5
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
//            System.out.println(!(a=b));
        System.out.println();

        //Ternary Operators
        // variable declaration
        int n1 = 5, n2 = 10, max;
        int n3 = 15;
        System.out.println("First num: " + n1);
        System.out.println("Second num: " + n2);

        // Largest among n1 and n2
        max = (n1 > n2) ? n1 : n2;//or we can use Math.max(n1,n2) for advance

        // Print the largest number
        System.out.println("Maximum is = " + max);
    }
}
