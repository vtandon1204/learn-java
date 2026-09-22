
public class demo3 {

    public static void main(String[] args) {
        // Chaining of Functions
        func();
        System.out.println("Bye");
    }

    static void func() {
        func2();
        System.out.println("Hi");
    }

    static void func2() {
        System.out.println("Hello");
    }
}
