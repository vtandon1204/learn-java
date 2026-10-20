// Call by Reference

public class demo2 {

    public static void main(String[] args) {
        Random r1 = new Random(4, 5);
        Random r2 = new Random(r1); // Deep Copy
        Random r3 = r1; // Shallow Copy
        System.out.println("r1: " + r1.x + ", " + r1.y);
        addTen(r1);
        System.out.println("r1: " + r1.x + ", " + r1.y);

        System.out.println("r2: " + r2.x + ", " + r2.y);
        System.out.println("r3: " + r3.x + ", " + r3.y);
        addTen(r3);
        System.out.println("r3: " + r3.x + ", " + r3.y);
        System.out.println("r1: " + r1.x + ", " + r1.y);

    }

    static void addTen(Random r) {
        r.x += 10;
        r.y += 10;
    }
}

class Random {

    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
