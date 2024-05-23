import java.util.ArrayList;
import java.util.Scanner;

public class MultipleArrayList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); // Create a Scanner object to read input from the user
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // Create a 2D ArrayList (list of lists)

        // Initialization: Create 3 inner ArrayLists and add them to the outer ArrayList
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>()); // Add a new inner ArrayList for each iteration
        }

        // Nested loops to populate the inner ArrayLists with user input
        for (int i = 0; i < 3; i++) { // Outer loop runs 3 times (for each inner ArrayList)
            for (int j = 0; j < 3; j++) { // Inner loop runs 3 times (for each element in the inner ArrayList)
                list.get(i).add(scn.nextInt()); // Read an integer from the user and add it to the current inner
                                                // ArrayList
            }
        }

        System.out.println(list); // Print the 2D ArrayList to the console
        scn.close(); // Close the Scanner to free up resources
    }
}
