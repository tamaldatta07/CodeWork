import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Declare an integer array of size 6
        int[] arr = new int[6];

        // Ask the user to enter 6 array elements
        System.out.println("Enter 6 Array Element: ");

        // Take input from user and store in the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Call isSorted method and store the result
        boolean IsArraySorted = isSorted(arr);

        // Print whether the array is sorted or not
        System.out.println("Result is: " + IsArraySorted);
        scn.close();
    }

    // Method to check if array is sorted in ascending order
    static boolean isSorted(int[] nums) {
        // Loop through array starting from index 1
        for (int i = 1; i < nums.length; i++) {
            // Compare current element with previous one
            if (nums[i] >= nums[i - 1]) {
                return true; // If condition satisfied, return true
            } else {
                return false; // If condition fails, return false
            }
        }
        // Method must return something outside the loop as well
        return true; // Default return (added to fix compilation issue)
    }
}
