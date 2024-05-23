public class ReverseArray {
    public static void main(String[] args) {
        // Initialize an array with some values
        int[] arr = { 1, 2, 5, 85, 47 };

        // Call the function to reverse the array
        reverseArray(arr);

        // Print the reversed array to the console
        System.out.println("Reversed array: " + java.util.Arrays.toString(arr));
    }

    // Function to reverse the array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from start to end until the middle of the array is reached
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the start index forward and the end index backward
            start++;
            end--;
        }
    }
}
