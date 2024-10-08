package LinearSearchALGO;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        // Define a 2D array (array of arrays) with integer values
        int[][] arr = {
                { 10, 24, 45 },
                { 17, 56, 90 },
                { 11, 65, 87, 34 }
        };

        // Define the target value to search for
        int target = 34;

        // Call the search2DArray method to find the position of the target
        int[] ans = search2DArray(arr, target);

        // Print the result as a string, which will show the row and column indices
        System.out.println(Arrays.toString(ans));
    }

    /**
     * This method searches for a target value in a 2D array.
     * 
     * @param arr    The 2D array of integers to search within
     * @param target The target value to search for
     * @return An array containing the row and column indices where the target is
     *         found,
     *         or {-1, -1} if the target is not found
     */
    static int[] search2DArray(int[][] arr, int target) {
        // Loop through each row of the 2D array
        for (int row = 0; row < arr.length; row++) {
            // Loop through each element in the current row
            for (int col = 0; col < arr[row].length; col++) {
                // If the current element matches the target, return the row and column indices
                if (arr[row][col] == target) {
                    return new int[] { row, col };
                }
            }
        }

        // If the target is not found, return {-1, -1} indicating not found
        return new int[] { -1, -1 };
    }
}
