/*Find the nth Fibonacci Number. 
0, 1, 1, 2, 3, 5, 8, 13
Input is 7 and Output will be 13 */

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        while (count <= n) {
            int temp = i;
            i = i + p;
            p = temp;
            count++;
        }
        System.out.println(i);
        scn.close();

    }
}
