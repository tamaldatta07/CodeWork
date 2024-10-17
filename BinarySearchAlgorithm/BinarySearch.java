
// import java.io.*;
//import java.util.*;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scn = new Scanner(System.in);

        // Read the size of the array
        int n = scn.nextInt();

        // Initialize an array of size n
        int arr[] = new int[n];

        // Take input for each element of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        // Read the target value (element to search for)
        int k = scn.nextInt();

        // Call binarySearch method and print the result (index of the target)
        System.out.println(binarySearch(arr, k));

        // Close the scanner object
        scn.close();
    }

    /**
     * This method performs a binary search on a sorted array.
     *
     * @param arr The sorted array in which to search
     * @param k   The target value to find
     * @return The index of the target value if found, otherwise -1
     */
    public static int binarySearch(int arr[], int k) {
        // Initialize start (st) and end (ed) pointers
        int st = 0, ed = arr.length - 1;

        // Continue searching while the start pointer is less than or equal to the end
        // pointer
        while (st <= ed) {
            // Calculate the middle index
            int mid = (st + ed) / 2;

            // Check if the middle element is less than the target
            if (arr[mid] < k) {
                // If true, move the start pointer to mid + 1 (search the right half)
                st = mid + 1;
            }
            // Check if the middle element is greater than the target
            else if (arr[mid] > k) {
                // If true, move the end pointer to mid - 1 (search the left half)
                ed = mid - 1;
            }
            // If the middle element is equal to the target
            else {
                // Return the index of the middle element (target found)
                return mid;
            }
        }

        // If the loop ends and target is not found, return -1
        return -1;
    }
}

// 5 --> Size of Array
// 10 --> --> No 0 element
// 20 --> No 1 element
// 30 --> No 2 element
// 35 --> No 3 element
// 40 --> No 4 element
// 15 --> Input
// -1 --> not available in the array that's why return -1.