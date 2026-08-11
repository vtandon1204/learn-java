
public class demo {

    public static void main(String[] args) {
        boolean b = true;
        int i = 5;
        // selection statements
        // if
        if (i == 5) {
            System.out.println("i is 5");
        }
        System.out.println("end of program 1");

        // if-else
        if (b) {
            System.out.println("b is true");
        } else {
            System.out.println("b is false");
        }
        System.out.println("end of program 2");

        if ((i & 1) != 0) {
            System.out.println("i is odd");
        } else {
            System.out.println("i is even");
        }

        // nested ifs
        if (i > 5) {
            if (i < 10) {
                System.out.println("i is between 5 and 10");
            }
        } else {
            System.out.println("i is smaller than 5");
        }

        // if-else-if ladder
        if (i == 5) {
            System.out.println("i is 5");
        } else if (i == 7) {
            System.out.println("i is 7");
        } else {
            System.out.println("i is neither 5 nor 7");
        }

        // switch 
        int x = 3;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            case 3:
                System.out.println("x is 3");
                break;
            default:
                System.out.println("x is nothing");
                break;
        }
    }
}
