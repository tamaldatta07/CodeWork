import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        /*
         * 3 Rows 3 Columns
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * 
         * int[][] arr = new int[3][];
         */

        // int[][] arr2D = {
        // { 1, 2, 3 }, // 0th index
        // { 4, 5 }, // 1st index
        // { 6, 7, 8, 9 } // 2nd index
        // };

        int[][] arr = new int[3][2];
        System.out.println(arr.length); // This will print the number of rows

        // input
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scn.nextInt();
            }
        }
        // System.out.println(Arrays.toString(arr));
        // Output using for loop
        /*
         * for (int row = 0; row < arr.length; row++) {
         * for (int col = 0; col < arr[row].length; col++) {
         * System.out.print(arr[row][col] + " ");
         * }
         * System.out.println(); // Ater every row it will print a new line
         * }
         */

        // Outpur Print using Arrays.toString
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
/*
 * 1 2 3 4 5 6 --> input
 * 1 2
 * 3 4
 * 5 6
 */
