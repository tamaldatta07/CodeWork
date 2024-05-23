public class MaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 25, 65, 85, 78 };
        System.out.println(findMax(arr));
    }

    static int findMax(int[] arr) {
        // Check if the array is empty and return Integer.MIN_VALUE if it is
        if (arr.length == 0) {
            return -1;
        }

        // Initialize the max value with the first element of the array
        int max = arr[0];

        // Iterate through the array to find the maximum value
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if the current element is greater
            }
        }

        // Return the maximum value found
        return max;
    }
}
