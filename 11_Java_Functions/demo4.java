
public class demo4 {

    // global scope -> use keyword 'static'
    static String name = "vaibhav";

    public static void main(String[] args) {
        // Scope of a Variable

        // Recursion
        // printNum(5);
        System.out.println(fib(4));
    }

    static void printNum(int n) {
        if (n == 0) { // base case
            return;
        }
        printNum(n - 1); // recursive call
        System.out.println(n);
    }

    static int fib(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
