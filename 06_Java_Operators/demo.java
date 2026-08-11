
public class demo {

    public static void main(String[] args) {
        // 1. Arithmetic Operators: +, -, *, /, %, +=, -=, *=, /=, %=, ++, --
        int a = 5;
        int b = 10;
        int sum = a + b; // 15
        int diff = a - b; // -5
        int prod = a * b; // 50
        int div = b / a; // 2
        int rem = b % a; // 0

        System.out.println(sum + ", " + diff + ", " + prod + ", " + div + ", " + rem);

        sum += 4; // 19
        diff -= 3; // -8
        prod *= 3; // 150
        div *= 2; // 1
        rem %= 4; // 0

        System.out.println(sum + ", " + diff + ", " + prod + ", " + div + ", " + rem);

        int num = 3;
        System.out.println(num);
        num++; // num = num + 1 --> num += 1
        System.out.println(num);
        num--; // num = num - 1 --> num -= 1
        System.out.println(num);

        // Pre & Post Increment & Decrement
        int num1 = 4;
        System.out.println(++num1);
        System.out.println(num1++);
        System.out.println(num1);

        // 2. Relational Operators: ==, !=, <, >, <=, >=
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b);
        System.out.println(a >= b);

        // 3. Bitwise Operators (bit manipulation): &, |, ^, ~, >>, <<, >>>, &=, |=, ^=, >>=, <<=, >>>=
        // Bitwise operations are performed always on int or long datatype
        byte b1 = 2; // 00000010
        byte b2 = 3; // 00000011

        System.out.println(b1 & b2); // 10 & 11 = 10 → 2
        System.out.println(b1 | b2); // 10 | 11 = 11 → 3
        System.out.println(b1 ^ b2); // 10 ^ 11 = 01 → 1
        System.out.println(~b1); // ~00000010 → 11111101 → -3
        System.out.println(b1 << 1); // 00000010 << 1 → 00000100 → 4; (left shift is multiply by 2^exp)
        System.out.println(b2 >> 1); // 00000011 >> 1 → 00000001 → 1; (right shift is divide by 2^exp)
        System.out.println(b2 >>> 1); // same as >> for positive → 1

        byte x = 2;
        // NOTE: compound operators auto-cast to byte
        x &= b2; // x = x & b2 → 2
        System.out.println(x);
        x |= b2; // x = x | b2 → 3
        System.out.println(x);
        x ^= b2; // x = x ^ b2 → 0
        System.out.println(x);

        x = 2;
        x <<= 1; // 2 << 1 → 4
        System.out.println(x);

        x = 2;
        x >>= 1; // 2 >> 1 → 1
        System.out.println(x);

        x = 2;
        x >>>= 1; // 2 >>> 1 → 1
        System.out.println(x);

        byte q = 64;
        // byte r = (q << 1); // incompatible types: possible lossy conversion from int to byte
        byte r = (byte) (q << 1); // typecasted to byte

        System.out.println(q << 1); // type promoted to int --> 128
        System.out.println(r); // -128
        System.out.println(r << 1); // -256
        System.out.println((byte) (r << 1)); // 0

        int i = 1;
        System.out.println(i << 31);
        System.out.println(Integer.MIN_VALUE);
        // shift operations in java are processed with % operation with 32 (x % 32)
        System.out.println(i << 33); // -> i << [33%32] = i << 1 = 2

        int z = 2; // 00000000 00000000 00000000 00000010 --> 2
        int y = 3; // 00000000 00000000 00000000 00000011 --> 3
        int c = z & y; // 00000000 00000000 00000000 00000010 --> 2
        int d = z | y; // 00000000 00000000 00000000 00000011 --> 3
        int e = z ^ y; // 00000000 00000000 00000000 00000001 --> 1
        int f = ~z; // 11111111 11111111 11111111 11111101 --> -3
        System.out.println(c + ", " + d + ", " + e + ", " + f
        );

        // Logical Operators: &&, ||, !
        // work on expressions and not bits 
        int n1 = 5;
        int n2 = 10;
        int n3 = 15;
        boolean n4 = true;
        boolean a1 = (a < b) && (b < c);
        boolean a2 = (a < b) || (b < c);
        boolean a3 = !n4;

        System.out.println(a1 + ", " + a2 + ", " + a3);

        // Short Circuiting: may skip evaluating the second condition if the first condition already determines the result.
        // 
        // if (false && something()) {
        //     // something() is never called
        // }
        // 
        // if (true || something()) {
        //     // something() is never called
        // }
        // 
        // Single & and | do NOT short-circuit:
        // 
        // if (true | ++a > 20) {
        //     // second condition still evaluated
        // }
        // Assignment Operator
        int p = q = r = 10;
        System.out.println(p + ", " + q + ", " + r);

        // Operator Precedence
    }
}
