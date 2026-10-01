
/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        Student s1 = new Student(); // constructor is called here

        s1.markAttendance();
        s1.print();

        Student s2 = new Student("tandon", 21, 102, "abc");
        s2.print();
    }
}

class Student {

    String name; // info/data/characteristics --> instance variable
    int age;
    int rollNo;
    String college;

    // No-argument constructor
    Student() {
        name = "vaibhav";
        age = 22;
        rollNo = 101;
        college = "xyz";
    }

    // default constructor
    // Student(){
    //     // empty
    // }

    // parameterized constructor
    Student(String n, int a, int rN, String clg) {
        name = n;
        age = a;
        rollNo = rN;
        college = clg;
    }

    
    void markAttendance() { // behaviours --> functions --> instance methods
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + ", " + age + ", " + rollNo + ", " + college);
    }

}
