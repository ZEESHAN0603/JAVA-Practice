package Phase2;

public class OperatorDemo {
    public static void main(String[] args) {
        // Unary Plus and Minus
        int a = 5;
        int plus = +a;   // unary plus (no change)
        int minus = -a;  // unary minus (negates value)
        System.out.println("Unary Plus: +a = " + plus);   // 5
        System.out.println("Unary Minus: -a = " + minus); // -5 just to show positive oe negative

        // Pre-increment vs Post-increment
        int b = 5;
        System.out.println("\nPre-increment (++b): " + (++b)); // increments first → 6
        System.out.println("Post-increment (b++): " + (b++)); // prints 6, then increments → 7
        System.out.println("Final value of b: " + b);         // 7

        // Pre-decrement vs Post-decrement
        int c = 5;
        System.out.println("\nPre-decrement (--c): " + (--c)); // decrements first → 4
        System.out.println("Post-decrement (c--): " + (c--)); // prints 4, then decrements → 3
        System.out.println("Final value of c: " + c);         // 3

        // Boolean negation
        boolean flag = true;
        System.out.println("\nBoolean flag = " + flag);       // true
        System.out.println("Negation !flag = " + !flag);      // false

        // Bitwise complement
        int x = 10;
        int y = ~x; // flips all bits
        System.out.println("\nOriginal x = " + x);            // 10
        System.out.println("Bitwise complement ~x = " + y);   // -11
    }
}
