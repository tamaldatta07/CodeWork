package LinearSearchALGO;

public class FindMinNumber {
    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = { 12, 14, 16, -8, 2, 9 };

        // Call the minNum method to find the minimum number in the array and print the
        // result
        System.out.println(minNum(arr));
    }

    /**
     * This method finds the minimum number in a given array of integers.
     * 
     * @param arr The array of integers to search
     * @return The smallest number in the array
     */
    // assume arr.length != 0
    static int minNum(int[] arr) {
        // Initialize the answer to the first element of the array
        int ans = arr[0];

        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is smaller than the current minimum, update the answer
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }

        // Return the minimum number found
        return ans;
    }
}
