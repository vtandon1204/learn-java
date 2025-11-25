
import java.util.Scanner;

// ** Variables **: containers to store a value;
//      - not begin with a digit
//      - case sensitive
//      - not a keyword
//      - no white space
// ** Datatypes **:
// -> Primitive datatypes: intrinsic
//      - byte: -128 to 127; 1 byte; default value is 0
//      - short: -(2^16)/2 to (2^16)/2 - 1; 2 bytes; default value is 0 
//      - int: -(2^32)/2 to (2^32)/2 - 1; 4 bytes; default value is 0
//      - float: ;4 bytes; default value is 0.0f
//      - long: -(2^64)/2 to (2^64)/2 - 1; 8 bytes; default value is 0
//      - double: ; 8 bytes; default value is 0.0d
//      - char: 0 to 2^16 - 1; 2 bytes because it supports unicode; default value is '\u0000' 
//      - bool: true or false; size depends on JVM(Java Virtual Machine); default value is false
// if any datatype takes (n) bytes, it's range is from -(2^8*n)/2 to (2^8*n)/2 - 1
// -> Non-primitive datatypes: derived
// ** Literals **: constant value assigned to a variable
// ** Keywords **: words which are reserved and used by the Java compiler; cannot be used a an identifier
public class Java02Datatypes {

    public static void main(String[] args) {
        System.out.println("Datatypes in Java");

        byte b1 = 22;
        char ch = 'A';
        float f1 = 23.4f;
        double d1 = 3.1; // by default, decimal is of double datatype
        long l1 = 424l;
        boolean bool = true; // by default, boolean is false
        String name = "tandon";
        System.out.println("Byte: " + b1);
        System.out.println("Char: " + ch);
        System.out.println("Float: " + f1);
        System.out.println("Double: " + d1);
        System.out.println("Long: " + l1);
        System.out.println("Boolean: " + bool);
        System.out.println("Name: " + name);

        // // ** User Input **: java has a scanner class which has a lot of methods to read the data from the keyboard 
        Scanner s = new Scanner(System.in); // read from the keyboard
        int age = s.nextInt(); // method to read from the keyboard
        System.out.println("age: " + age);
        s.nextLine();
        // * Important *: After reading an integer using nextInt(), use nextLine() once to clear the leftover newline before reading a full string.
        String fullName = s.nextLine(); // read full string (even white spaces)
        System.out.println("name: " + fullName);

        String firstName = s.next(); // read only first word
        System.out.println("first name: " + firstName);
        // When you're done using it, closing the scanner:
        // -> Releases the resources
        // -> Prevents memory/resource leaks
        // -> Good programming practice

        System.out.println(s.hasNextInt()); // to check if user has input as integer or not
        s.close();

    }
}
