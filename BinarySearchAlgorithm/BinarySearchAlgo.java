public class BinarySearchAlgo {
    public static void main(String[] args) {
        // Sample array in ascending order
        int arr[] = { 2, 3, 4, 10, 40 };
        int k = 10; // Target value to search for

        // Sample array in descending order
        int arr1[] = { 40, 30, 10, 5, 3, 2 };
        int x = 30; // Target value to search for

        // Perform order-agnostic binary search on ascending array
        int ans = orderAgnosticBS(arr, k);
        System.out.println("The Answer is " + ans);

        // Perform order-agnostic binary search on descending array
        int ans1 = orderAgnosticBS(arr1, x);
        System.out.println("The Answer is " + ans1);
    }

    /**
     * This method performs an order-agnostic binary search on a sorted array.
     * It first determines whether the array is sorted in ascending or descending
     * order,
     * then performs binary search accordingly.
     *
     * @param arr    The sorted array (either ascending or descending)
     * @param target The value to search for
     * @return The index of the target value if found, otherwise -1
     */
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Determine if the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        // Start the binary search loop
        while (start <= end) {
            // Calculate the middle index
            int mid = start + (end - start) / 2;

            // If the target is found at the mid index, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // For ascending order
            if (isAsc) {
                if (target < arr[mid]) {
                    // If the target is smaller than the mid element, search the left half
                    end = mid - 1;
                } else {
                    // If the target is larger, search the right half
                    start = mid + 1;
                }
            }
            // For descending order
            else {
                if (target > arr[mid]) {
                    // If the target is larger than the mid element, search the left half (because
                    // it's descending)
                    end = mid - 1;
                } else {
                    // If the target is smaller, search the right half
                    start = mid + 1;
                }
            }
        }

        // If the target is not found, return -1
        return -1;
    }
}
