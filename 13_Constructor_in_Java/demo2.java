
public class demo2 {

    public static void main(String[] args) {
        Student s1 = new Student();
    }
}

class Student {

    String name;
    int age;
    int rollNo;
    String college;

    Student() {
    }

    Student(String name, int age, int rollNo, String college) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
    }

    void markAttendance() {
        System.out.println("Attendance marked by " + name);
    }

    void print() {
        System.out.println(name + ", " + age + ", " + rollNo + ", " + college);
    }
}
