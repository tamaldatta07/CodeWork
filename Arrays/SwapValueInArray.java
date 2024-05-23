import java.util.Arrays;

public class SwapValueInArray {
    public static void main(String[] args) {
        // Initialize an array with some values
        int[] arr = { 1, 2, 5, 85, 47 };

        // Call the swap method to swap elements at index 1 and 3
        swap(arr, 1, 3);

        // Print the modified array to the console
        System.out.println(Arrays.toString(arr));
    }

    // Method to swap elements at indices i and j in the array
    static void swap(int[] arr, int i, int j) {
        // Store the value at index i in a temporary variable
        int temp = arr[i];

        // Assign the value at index j to index i
        arr[i] = arr[j];

        // Assign the value stored in the temporary variable to index j
        arr[j] = temp;
    }
}
