package LinearSearchALGO;

import java.util.Arrays;

public class LinearSearchQ1 {
    public static void main(String[] args) {
        String name = "HARIHAR";
        char target = 'I';

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name, target));
        System.out.println(search2(name, target));

    }

    // By using For Each loop
    static boolean search2(String str, char target) {
        if (str.length() == 0) { // if length of the string is 0 then return false
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) { // If character of that array == target then return true
                return true;
            }
        }
        return false; // Else return false
    }

    // By using for loop
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}

// Search a particular letter of a String using linear search algorithm