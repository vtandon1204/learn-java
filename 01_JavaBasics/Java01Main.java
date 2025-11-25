// * JDK *: Java Development Kit
// * JRE *: Java Runtime Environment

// ** Package **: used to group related classes; similar to a folder in a file system; keep your code organized and avoids name conflicts between classes.
// -> Built-in package
// -> User defined package
// // File: mypackage/Hello.java
// package mypackage;
// public class Hello {
//     public void sayHello() {
//         System.out.println("Hello from my package!");
//     }
// }
// Then you can use it in another file:
// // File: Test.java
// import mypackage.Hello;
// public class Test {
//     public static void main(String[] args) {
//         Hello obj = new Hello();
//         obj.sayHello();
//     }
// }
// ** Functions **: In Java, functions are called methods.
// A method is a block of code that performs a specific task and can be reused.
// modifier returnType methodName(parameters) {
//     // method body
// }
// -> Method Overloading
// public int add(int a, int b) {
//     return a + b;
// }
// public double add(double a, double b) {
//     return a + b;
// }
// ** Classes **: user defined template used to create objects; defines attributes(variables) and behaviours(methods); collection of similar functions;
// Naming Conventions:
// -> classes: PascalConvention
// -> functions: camelCaseConvention
class Car {

    // Attributes
    String brand;
    int year;

    // Method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class Java01Main {

    // Static Method
    static void staticMethod() {
        System.out.println("Static Method");
    }

    // Non-Static Method
    void nonStaticMethod() {
        System.out.println("Non-Static Method");
    }

    // -> Method with a return value
    public int square(int n) {
        return n * n;
    }

    // -> Methods without return value (void)
    public static void main() {
        System.out.println("Hello VT ");

        staticMethod(); // calling static

        Java01Main obj = new Java01Main();
        obj.nonStaticMethod(); // calling non-static

        // Creating object of Car class
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.year = 2020;
        myCar.displayInfo();
    }
}
