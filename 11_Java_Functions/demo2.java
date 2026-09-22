
public class demo2 {

    public static void main(String[] args) {
        // Function Overloading
        int a = 2;
        int b = 4;
        int c = 5;
        int ans1 = sum(a, b, c);

        int ans2 = sum(34.4, 3.7);
        System.out.println(ans2);

        greet("vaibhav");

        greet("vaibhav", "tandon");
    }

    static int sum(int a, int b) {
        return a + b;
    }
    // different number of parameters
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // different parameters
    static int sum(double a, double b) {
        return (int) (a + b);
    }

    static void greet(String name) {
        System.out.println("hello " + name);
    }
    
    static void greet(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
