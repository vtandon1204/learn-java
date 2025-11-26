// ** Operators **
// * Types *
// -> Arithmetic: +, -, *, /, %, ++, --
// -> Assignment: =, +=
// -> Comparison: ==, >=, >, <=, <
// -> Logical: &&, ||, !
// -> Bitwise: &, | (operates bitwise)

// Arithmetic operators cannot work with boolean
// % operator can work with float and double
public class Java03Operators {

    public static void main(String[] args) {
        System.out.println("Operators in Java");

        System.out.println(4.4 % 1.23);

        // * Precedence *: (*) and (/) has higher precendence than (+) and (-)
        // * Associativity *: left to right in programming
        System.out.println(6 * 5 - 34 / 2);
        /*
        = 30-34/2
        = 30-17
        = 13
         */
        System.out.println(60 / 5 - 3 * 2);
        /*
        = 12-3*2
        = 12-6
        = 6
         */

        // * Resulting Datatype after arithmetic operation *
        // b: byte
        // s: short
        // f: float
        // i: int
        // l: long
        // d: double
        // c: char
        // b + s = i
        // s + i = i
        // l + f = f
        // i + f = f
        // c + i = i
        // c + s = i
        // l + d = d
        // f + d = d

        // * Increment & Decrement operators *: datatype remains the same
        // i++ : first use then increment
        // ++i : first increment then use
        int a = 7;
        System.out.println(++(a)*8);

        char c = 'A';
        System.out.println(++c);
        
    }
}
