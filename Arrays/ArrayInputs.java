import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // Array of primitives
        /*
         * int[] arr = new int[5];
         * arr[0] = 5;
         * arr[1] = 15;
         * arr[2] = 25;
         * arr[3] = 35;
         * arr[4] = 45;
         * System.out.println(arr[3]);
         */

        // Taking input using for loop
        /*
         * for (int i = 0; i < arr.length; i++) {
         * arr[i] = scn.nextInt();
         * }
         */

        // Print using for loop
        /*
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i] + " ");
         * }
         */

        // Another way of printing the array using for each loop
        /*
         * for (int i : arr) { // for every element in array, print the element
         * System.out.print(i + " "); // here i represents element of the array
         * }
         */

        /*
         * Another way of printing the array
         * toString will convert an array into a string and print it.
         * System.out.println(Arrays.toString(arr));
         */

        // Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scn.next();
        }
        System.out.println(Arrays.toString(str));
        scn.close();

    }
}
