
public class demo {

    public static void main(String[] args) {
        int i = 1;

        // while loop
        while (i <= 10) {
            System.out.println(i++);
        }
        i = 1;
        // do-while loop
        do {
            System.out.println(i++);
        } while (i <= 10);
        // for loop
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        // comma seperated variation
        for (int k = 0, j = 10; k < j; k++, j--) {
            System.out.println(k + " " + j);
        }
        // nested loops
        for (int x = 1; x <= 3; x++) {
            System.out.println();
            System.out.println("Table of " + x);
            for (int y = 0; y <= 10; y++) {
                System.out.println(x + "*" + y + "=" + x * y);
            }
        }
        // jump statements
        // break
        int p = 3;
        boolean b = true;
        for (int k = 2; k < p; k++) {
            if (p % k == 0) {
                b = false;
                break;
            }
        }
        if (b) {
            System.out.println("number is prime");
        } else {
            System.out.println("number is not prime");
        }

        // continue
        for (int k = 0; k <= 10; k++) {
            if ((k & 1) == 1) { // odd numbers
                System.out.println(k);
            }
        }
        for (int k = 0; k <= 10; k++) {
            if ((k & 1) != 1) { // even numbers
                System.out.println("skip " + k);
                continue;
            }
            System.out.println(k); // odd numbers
        }

        // Labels
        outer:
        for (int q = 1; q <= 10; q++) {
            inner:
            for (int r = 1; r <= q; r++) {
                if (q > 5) {
                    break outer;
                }
                System.out.print("* ");

            }
            System.out.println();
        }

        // Code Blocks
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("hello");
                }
            }
        }
    }
}
