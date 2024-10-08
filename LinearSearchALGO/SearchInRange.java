package LinearSearchALGO;

public class SearchInRange {
    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = { 18, 12, -7, 3, 14, 28 };

        // Define the target value to search
        int target = 3;

        // Call the linearSearch method and print the result
        // The search is limited to the range from index 1 to 4
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    /**
     * This method performs a linear search within a specified range of an array.
     *
     * @param arr    The array of integers to search within
     * @param target The target value to search for
     * @param start  The starting index of the range (inclusive)
     * @param end    The ending index of the range (inclusive)
     * @return The index of the target value if found, or -1 if not found
     */
    static int linearSearch(int[] arr, int target, int start, int end) {
        // If the array is empty, return -1 as no search can be done
        if (arr.length == 0) {
            return -1;
        }

        // Loop through the specified range of the array
        for (int index = start; index <= end; index++) {
            int element = arr[index]; // Access the element at the current index

            // If the current element matches the target, return the index
            if (element == target) {
                return index;
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
