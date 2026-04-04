
public class demo {

    public static void main(String[] args) {
        // Integers(10): byte, short, int, long
        // Binary(2), Octal(8), Hexadecimal(16) number system
        byte b = 5;
        byte b_binary = 0b101; // 0b101 in binary is 5 in decimal
        byte b_octal = 05; // 05 in octal (0-7) is 5 in decimal
        byte b_hexademical = 0XF; // 0XF in hexadecimal (0-15) is 15 in decimal
        short s = 10;
        int i = 2342;
        long l = 1_31_34_56_252; // can put underscores for readability and the compiler will ignore these underscores
        // but underscores cannnot be used after or before 'e' in scientific way and decimal point in real numbers
        System.out.println("integer values --> " + b + ", " + s + ", " + i + ", " + l);
        System.out.println("binary value --> " + b_binary);
        System.out.println("octal value --> " + b_octal);
        System.out.println("hexadecimal value --> " + b_hexademical);

        // Real Numbers: float, double
        float f = 120.3f; // single precision; have to add an f at the end for the float datatype; as without 'f' compiler considers it as a double but the datatype mentioned is float and throws an error of float cannot be converted to double
        double d = 34.643; // double precision --> standard way
        double d_sci = 6.022e23; // 6.022 * 10^23 --> scientific way
        System.out.println("real numbers values --> " + f + ", " + d);
        System.out.println("scientific way value --> " + d_sci);

        // Characters: char
        char c = 'v';
        System.out.println("characters --> " + c);

        // Boolean: boolean
        boolean flag_t = true;
        boolean flag_f = false;
        System.out.println("boolean values --> " + flag_t + ", " + flag_f);

        int num; // 32 bit in memory; declaration
        num = 4; // defination
    }
}
