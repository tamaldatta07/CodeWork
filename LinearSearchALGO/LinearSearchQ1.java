package LinearSearchALGO;

import java.util.Arrays;

public class LinearSearchQ1 {
    public static void main(String[] args) {
        // Initialize a string to search within
        String name = "HARIHAR";

        // Define the target character to search for
        char target = 'I';

        // Convert the string to a char array and print it
        System.out.println(Arrays.toString(name.toCharArray()));

        // Call the search method using a traditional for loop and print the result
        System.out.println(search(name, target));

        // Call the search method using a for-each loop and print the result
        System.out.println(search2(name, target));
    }

    /**
     * This method performs a linear search on a string using a for-each loop.
     *
     * @param str    The string to search within
     * @param target The target character to search for
     * @return true if the target character is found, false otherwise
     */
    static boolean search2(String str, char target) {
        // If the string is empty, return false as the target can't be found
        if (str.length() == 0) {
            return false;
        }

        // Loop through each character in the string using a for-each loop
        for (char ch : str.toCharArray()) {
            // If the current character matches the target, return true
            if (ch == target) {
                return true;
            }
        }

        // If the target is not found after the loop, return false
        return false;
    }

    /**
     * This method performs a linear search on a string using a traditional for
     * loop.
     *
     * @param str    The string to search within
     * @param target The target character to search for
     * @return true if the target character is found, false otherwise
     */
    static boolean search(String str, char target) {
        // If the string is empty, return false as the target can't be found
        if (str.length() == 0) {
            return false;
        }

        // Loop through the string using a traditional for loop
        for (int i = 0; i < str.length(); i++) {
            // If the character at index i matches the target, return true
            if (target == str.charAt(i)) {
                return true;
            }
        }

        // If the target is not found after the loop, return false
        return false;
    }
}
