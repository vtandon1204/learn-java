
/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        int a = 2;
        int b = 4;
        int ans = sum(a, b); // here, a and b are the arguments
        System.out.println(ans);
        printHello();
        greet("vaibhav");
        int num = getNumber();
        System.out.println(num);
    }

    // 4. input, output
    static int sum(int a, int b) {
        return a + b;
    }

    // 1. No input, No output
    static void printHello() {
        System.out.println("hello");
        return; // optional
    }

    // 2. input, No output
    static void greet(String name) {
        System.out.println("hello " + name);
    }

    // 3. No input, output
    static int getNumber() {
        return 10;
    }
}
