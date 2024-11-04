public class RotationCount {

    /**
     * Finds the number of times a sorted array has been rotated.
     * The index of the smallest element in a rotated sorted array represents
     * the rotation count.
     * 
     * @param arr The input sorted and rotated array
     * @return The number of rotations (index of the smallest element)
     */
    public static int countRotations(int[] arr) {
        int start = 0, end = arr.length - 1;

        // Case when the array is not rotated at all
        if (arr[start] <= arr[end]) {
            return 0; // Array is already in ascending order
        }

        // Perform binary search to locate the smallest element (rotation pivot)
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the mid-point

            // Check if mid element is the smallest (pivot point)
            // Condition: If mid is smaller than its previous element, it is the pivot
            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                return mid; // Return mid as the rotation count
            }

            // Check if the element next to mid is the pivot
            // Condition: If mid element is greater than the next element, mid + 1 is the
            // pivot
            if (mid < arr.length - 1 && arr[mid] > arr[mid + 1]) {
                return mid + 1; // Return mid + 1 as the rotation count
            }

            // Decide which half to search in next:
            // If mid element is greater than the last element, the pivot is in the right
            // half
            if (arr[mid] > arr[end]) {
                start = mid + 1; // Move start to mid + 1 to focus on the right half
            } else {
                // Otherwise, the pivot is in the left half
                end = mid - 1; // Move end to mid - 1 to focus on the left half
            }
        }

        // In case no rotation found, return 0 (should not be reached in a rotated
        // array)
        return 0;
    }

    public static void main(String[] args) {
        // Example array which is sorted and rotated
        int[] arr = { 15, 18, 2, 3, 6, 12 };

        // Calculate the number of rotations
        int rotations = countRotations(arr);

        // Print the result
        System.out.println("Array is rotated " + rotations + " times.");
    }
}
