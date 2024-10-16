package LinearSearchALGO;

public class MaxWealth {
    public static void main(String[] args) {
        // Define a 2D array where each row represents the wealth of a customer
        int[][] accounts = {
                { 1, 2, 3 }, // Customer 1 has 1, 2, 3 in their accounts
                { 3, 2, 1 }, // Customer 2 has 3, 2, 1 in their accounts
                { 4, 6, 5 } // Customer 3 has 4, 6, 5 in their accounts
        };

        // Call the maxWealth method and print the result
        int richest = maximumWealth(accounts);
        System.out.println("The richest customer's wealth is: " + richest);
    }

    public static int maximumWealth(int[][] accounts) {
        // person == row
        // account == col
        int ans = Integer.MIN_VALUE;

        // Loop through each person
        for (int person = 0; person < accounts.length; person++) {
            int newSum = 0;
            for (int account = 0; account < accounts[person].length; account++) {

                newSum += accounts[person][account];
            }
            // Update maxWealth if the current customer's wealth is greater
            if (newSum > ans) {
                ans = newSum;
            }
        }
        return ans; // Return the maximum wealth found
    }

}

/*
 * 1672.Richest Customer Wealth:
 * https://leetcode.com/problems/richest-customer-wealth/description/
 * 
 * Input:accounts=[[1,5],[7,3],[3,5]]
 * Output:10
 * Explanation:
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 */