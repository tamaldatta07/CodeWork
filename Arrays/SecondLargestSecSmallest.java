// You have been given an array ‘a’ of ‘n’ unique non-negative integers.
// Find the second largest and second smallest element from the array.
// Return the two elements (second largest and second smallest) as another array of size 2.
// Example :
// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]
// The second largest element after 5 is 4, and the second smallest element after 1 is 2.

import java.util.Scanner;

public class SecondLargestSecSmallest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Create an array of size 6
        int[] arr = new int[6];

        // Take input for the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Call method to find second largest and second smallest
        int[] resultArray = secondLargestSecsmallet(arr);

        // Print results
        System.out.println("Second largest element is: " + resultArray[0]);
        System.out.println("Second smallest element is: " + resultArray[1]);

        scn.close(); // Close scanner
    }

    // Method to find second largest and second smallest in array
    static int[] secondLargestSecsmallet(int[] nums) {
        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        // Initialize smallest and second smallest
        int smallest = Integer.MAX_VALUE;
        int SecSmallest = Integer.MAX_VALUE;

        // First loop → find largest and second largest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                // Update second largest before updating largest
                secLarge = largest;
                largest = nums[i];
            } else if (nums[i] > secLarge && nums[i] != largest) {
                // Candidate for second largest
                secLarge = nums[i];
            }
        }

        // Second loop → find smallest and second smallest
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                // Update second smallest before updating smallest
                SecSmallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < SecSmallest && nums[i] != smallest) {
                // Candidate for second smallest
                SecSmallest = nums[i];
            }
        }

        // Return both as an array → index 0 = second largest, index 1 = second smallest
        return new int[] { secLarge, SecSmallest };
    }
}
