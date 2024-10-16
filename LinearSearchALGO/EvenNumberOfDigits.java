package LinearSearchALGO;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        // Define an array of integers
        int[] nums = { 12, 345, 2, 6, 7896, 45678 };

        // Call the countEvenDigits method to find how many numbers have an even number
        // of digits
        int result = countEvenDigits(nums);

        // Print the result
        System.out.println("Numbers with an even number of digits: " + result);
    }

    /**
     * This method counts how many numbers in the array have an even number of
     * digits.
     * 
     * @param nums The array of integers to search
     * @return The count of numbers with an even number of digits
     */
    static int countEvenDigits(int[] nums) {
        int count = 0;

        // Loop through each number in the array
        for (int num : nums) {
            // If the number of digits is even, increment the count
            if (Integer.toString(num).length() % 2 == 0) {
                count++;
            }
        }

        // Return the count of numbers with even digits
        return count;
    }
}

// 1295. Find Numbers with Even Number of Digits
/*
 * Example 1:
 * 
 * Input:nums=[12,345,2,6,7896]
 * Output:2
 * Explanation:
 * 12 contains 2 digits(even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 */