public class Operators {
    public static void main(String[] args) {

        // arithmetic operators
        int a = 5;
        int b = 10;
        System.out.println(a + b); // addition
        System.out.println(a - b); // subtraction
        System.out.println(a * b); // multiplication
        System.out.println(a / b); // division
        System.out.println(a % b); // modulo

        // relational operators
        System.out.println(a == b); // equal to
        System.out.println(a != b); // not equal to
        System.out.println(a > b); // greater than
        System.out.println(a < b); // less than
        System.out.println(a >= b); // greater than or equal to
        System.out.println(a <= b); // less than or equal to

        // logical operators
        boolean c = true;
        boolean d = false;
        System.out.println(c && d); // Logical AND
        System.out.println(c || d); // Logical OR
        System.out.println(!c); // Logical NOT

        // bitwise operators
        System.out.println(a & b); // Bitwise AND
        System.out.println(a | b); // Bitwise OR
        System.out.println(a ^ b); // Bitwise XOR
        System.out.println(~a); // Bitwise NOT
        System.out.println(a << b); // Bitwise left shift
        System.out.println(a >> b); // Bitwise right shift
        System.out.println(a >>> b); // Bitwise unsigned right shift

        // unary operators
        System.out.println(a++); // Post increment
        System.out.println(a--); // Post decrement
        System.out.println(++a); // Pre increment
        System.out.println(--a); // Pre decrement
        System.out.println(+a); // Unary plus
        System.out.println(-a); // Unary minus

        // assignment operators
        int x = 10;
        x += 5; // x = x + 5
        System.out.println(x);
        x -= 5; // x = x - 5
        System.out.println(x);
        x *= 5; // x = x * 5
        System.out.println(x);
        x /= 5; // x = x / 5
        System.out.println(x);
        x %= 5; // x = x % 5
        System.out.println(x);

        // ternary operator
        int y = (a > b) ? a : b; // if a > b then y = a else y = b
        System.out.println(y);

    }
}
