
/**
 * demo
 */
public class demo {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "vaibhav";
        s1.age = 22;
        s1.rollNo = 101;
        s1.college = "abc college";

        s1.markAttendance();
        s1.print();
    }
}

class Student {

    String name;
    int age;
    int rollNo;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + ", " + age + ", " + rollNo + ", " + college);
    }

}
