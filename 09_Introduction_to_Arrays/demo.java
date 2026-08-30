
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

        int[] arr1; // declaration

        int[] arr2 = new int[3]; // definition

        arr2[0] = 11;
        arr2[1] = 12;
        arr2[2] = 13;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        int[] arr3 = new int[3];
        int x = 1001;

        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = x++;
        }

        int[] rollNums = {101, 102, 103};

        for (int num : rollNums) {
            System.out.println(num);
        }

        //  2-D Arrays
        int[][] marks = new int[3][3]; // mentioning the number of rows is compulsory, but mentioning the number of columns is optional as number of columns can be different for each row

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) { // iterate through each row
            for (int j = 0; j < marks[i].length; j++) { // iterate through each column in a particular row
                int num = sc.nextInt(); // input an integer
                marks[i][j] = num;
            }
        }

        for (int i = 0; i < marks.length; i++) {
            System.out.println("marks of student " + (i + 1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("subject " + (j + 1) + ": " + marks[i][j]);
            }
        }

        sc.close();

        // 3-D array
        int[][][] arr = new int[3][][];

    }
}