import java.util.Scanner;

public class SecondLargeInArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Create an array of size 6
        int[] arr = new int[6];
        System.out.println("Enter 6 integers: ");

        // Take array input from user
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        // Call function to find second largest element
        int secondLargest = findSecondLarge(arr);

        // Print the result
        System.out.println("Second Largest Element in the Array is: " + secondLargest);
    }

    /**
     * Finds the second largest element in an integer array.
     * 
     * @param nums input integer array
     * @return the second largest element
     * 
     *         Approach:
     *         1. First find the largest element in the array.
     *         2. Then scan again to find the largest element that is not equal to
     *         'largest'.
     */
    static int findSecondLarge(int[] nums) {
        // Step 1: Find the largest element
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        // Step 2: Find the second largest element
        // Initialize to minimum possible value for safety (instead of -1)
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }

        // Optional: Handle case when no second largest exists
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (array may have all same elements).");
            return -1; // returning -1 as a fallback
        }

        return secondLargest;
    }
}
// Better solution