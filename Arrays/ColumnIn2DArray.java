// import java.util.Arrays;

public class ColumnIn2DArray {
    public static void main(String[] args) {
        // Initialize a 2D array with varying column lengths
        int[][] arr = {
                { 1, 2, 3 }, // First row with 3 elements
                { 4, 5 }, // Second row with 2 elements
                { 6, 7, 8, 9 } // Third row with 4 elements
        };

        // Iterate over each row of the 2D array
        for (int row = 0; row < arr.length; row++) {
            // Iterate over each column of the current row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " "); // Print the current element followed by a space

                // Uncomment the next line to print the entire current row as an array
                // System.out.print(Arrays.toString(arr[row]));
            }
            System.out.println(); // Move to the next line after printing all elements of the current row
        }
    }
}
