public class CountOfElement {
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

    public static int countOccurrence(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target); // Calculate first occurrence
        if (first == -1) {
            return 0;
        }
        int last = findLastOccurrence(arr, target); // Calculate last occurrence

        return last - first + 1; // Calculate total count
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 5, 5, 5, 10, 14 };
        int target = 5;
        int totalCount = countOccurrence(arr, target);
        System.out.println("Total count of target: " + totalCount);
    }
}
