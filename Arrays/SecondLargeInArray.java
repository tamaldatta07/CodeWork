import java.util.Scanner;

public class SecondLargeInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Create an array of fixed size 6
        int[] arr = new int[6];

        System.out.println("Enter elements for an array: ");

        // Take input from the user for all 6 elements
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Call the function to find second largest element
        int secondLargest = findSecondLarge(arr);

        // Print the result
        System.out.println("Second largest element is: " + secondLargest);

        scn.close();
    }

    /**
     * Function to find the second largest element in the array
     * 
     * @param nums input array
     * @return the second largest element
     */
    static int findSecondLarge(int[] nums) {
        // Initialize largest and second largest to very small values
        int largest = Integer.MIN_VALUE;
        int Seclargest = Integer.MIN_VALUE;

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // If current number is greater than largest, update both largest and second
            // largest
            if (nums[i] > largest) {
                Seclargest = largest;
                largest = nums[i];
            }
            // If current number is smaller than largest but greater than second largest
            else if (nums[i] > Seclargest && nums[i] != largest) {
                Seclargest = nums[i];
            }
        }

        // Return the second largest value
        return Seclargest;
    }
}

// best solution
