public class FirstLastOccurrence {

    // Method to find the first occurrence of a target in a sorted array
    public static int findFirstOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int firstOccurrence = -1;

        // Perform binary search to find the first occurrence of the target
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the mid-point
            if (arr[mid] == target) {
                firstOccurrence = mid; // Store the index of the found occurrence
                end = mid - 1; // Continue searching in the left half to find the first occurrence
            } else if (arr[mid] > target) {
                end = mid - 1; // Target is smaller, search in the left half
            } else {
                start = mid + 1; // Target is larger, search in the right half
            }
        }
        return firstOccurrence; // Return the first occurrence or -1 if not found
    }

    // Method to find the last occurrence of a target in a sorted array
    public static int findLastOccurrence(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        int lastOccurrence = -1;

        // Perform binary search to find the last occurrence of the target
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the mid-point
            if (arr[mid] == target) {
                lastOccurrence = mid; // Store the index of the found occurrence
                start = mid + 1; // Continue searching in the right half to find the last occurrence
            } else if (arr[mid] > target) {
                end = mid - 1; // Target is smaller, search in the left half
            } else {
                start = mid + 1; // Target is larger, search in the right half
            }
        }
        return lastOccurrence; // Return the last occurrence or -1 if not found
    }

    public static void main(String[] args) {
        // Test array and target value
        int[] arr = { 2, 5, 7, 8, 8, 8, 8, 10 };
        int target = 8;

        // Find the first and last occurrence of the target
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);

        // Print the results if occurrences are found
        if (first != -1 && last != -1) {
            System.out.println("First Occurrence: " + first);
            System.out.println("Last Occurrence: " + last);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

}
