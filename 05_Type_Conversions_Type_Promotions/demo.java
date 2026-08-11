
public class demo {

    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        // int to double
        int num1 = 10;
        double result1 = num1;  // int → double (automatic)
        System.out.println(num1); // Output: 10
        System.out.println(result1);  // Output: 10.0

        // char to int
        char ch = 'v';
        int i_ch = ch;
        System.out.println(ch); // Output: v
        System.out.println(i_ch); // Output: 118

        // Explicit Type Conversion (Narrowing)
        // double to int
        double num2 = 10.75;
        int result2 = (int) num2;  // double → int (manual casting)
        System.out.println(num2); // Output: 10.75
        System.out.println(result2);  // Output: 10

        // int to byte
        int i = 128;
        // byte b = i;
        byte b = (byte) i;
        System.out.println(i); // Output: 300 (binary -> 100101100)
        System.out.println(b); // Output: 44 -> Data Loss/Truncate as it stores only first 8 bits of 32-bit sized int variable (binary -> 0010110 -> 44 in integer)

        // Boolean to any data type -> Not Possible
        boolean bool = false;
        // int i_b = bool;
        // int i_b = (int) bool;

        // To get a byte value from an int, Java keeps only the lower 8 bits (equivalent to value % 256(range of byte) for positives)
        // Example: 300 % 256 = 44 → (byte)300 gives 44
        // (byte)x = 
        //          x % 256              if ≤ 127
        //          (x % 256) - 256      if ≥ 128
        // (byte)128
        //          128 % 256 = 128
        //          128 - 256 = -128 
        // ------------------------------------
        // Type Promotion
        byte x = 10;
        byte y = 20;
        // byte result = x + y; ERROR
        int result = x + y;   // Correct
        System.out.println(result);

        byte p = 10;
        byte q = 20;
        byte r = (byte) (p + q);  // explicit cast needed
        System.out.println(r);
    }
}
