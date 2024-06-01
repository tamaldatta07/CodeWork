import java.util.Scanner;

public class LargestInArray {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scn = new Scanner(System.in);

        // Create an array to store input elements
        int[] arr = new int[6];

        // Prompt the user to input elements into the array
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // Read input and store it in the array
        }

        // Call the findLargest function to find the largest element in the array
        int largestInArray = findLargest(arr);

        // Print the largest element found in the array
        System.out.println("The largest element in the array is: " + largestInArray);

        // Close the Scanner object to release resources
        scn.close();
    }

    // Function to find the largest element in an array
    static int findLargest(int[] nums) {
        int largest = nums[0]; // Assume the first element is the largest

        // Iterate through the array to find the largest element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) { // If the current element is larger than the current largest
                largest = nums[i]; // Update the largest element
            }
        }
        return largest; // Return the largest element found
    }
}
