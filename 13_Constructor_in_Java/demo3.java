
public class demo3 {

    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("vt");
        // Student s3 = new Student("vaibhav", 22);
        // Student s4 = new Student("tandon", 22, 102);
        // Student s5 = new Student("VT", 22, 103, "abc");

        s1.print();
        // s2.print();
        // s3.print();
        // s4.print();
        // s5.print();

    }
}

class Student {

    String name;
    int age;
    int rollNo;
    String college;

    // Student() {
    //     this("unknown", 0, 0, "unknown");
    //     System.out.println("first constructor");
    // }

    Student() {
        this("unknown");
    System.out.println("first constructor");
    }
    // ------------------------------------------------------------
    // Student(String name) {
    //     this.name = name;
    // System.out.println("second constructor");
    // }
    // Student(String name) { // calling the final constructor
    //     this(name, 0, 0, "unknown");
    //     System.out.println("second constructor");
    // }

    Student(String name) { // calling the next constructor
        this(name, 0);
    System.out.println("second constructor");
    }
    // ------------------------------------------------------------
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // System.out.println("third constructor");
    // }
    // Student(String name, int age) {
    //     this(name, age, 0, "unknown");
    //     System.out.println("third constructor");
    // }

    Student(String name, int age) {
        this(name, age, 0);
    System.out.println("third constructor");
    }
    // ------------------------------------------------------------
    // Student(String name, int age, int rollNo) {
    //     this.name = name;
    //     this.age = age;
    //     this.rollNo = rollNo;
    // System.out.println("fourth constructor");
    // }
    Student(String name, int age, int rollNo) {
        this(name, age, rollNo, "unknown");
        System.out.println("fourth constructor");
    }

    // ------------------------------------------------------------
    Student(String name, int age, int rollNo, String college) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
        System.out.println("final constructor");
    }

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + ", " + age + ", " + rollNo + ", " + college);
    }
}
