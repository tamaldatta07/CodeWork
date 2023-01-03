import java.util.*;
import java.util.Scanner;

public class SumofArrray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(); // Size of the first array
        int[] arr1 = new int[n1];

        for (int i = 0; i < arr1.length; i++) { // take input for the first array
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt(); // Size of second array
        int[] arr2 = new int[n2];

        for (int i = 0; i < arr2.length; i++) { // take input for the second array
            arr2[i] = scn.nextInt();
        }

        int n3 = Math.max(n1, n2);
        int[] sum = new int[n3]; // size of the sum array according to first and second array
        int c = 0; // c will be carrry for the sum

        int i = arr1.length - 1; // pointer for the first array
        int j = arr2.length - 1; // pointer for the second array
        int k = sum.length - 1; // pointer for the sum array

        while (k >= 0) {
            int d = c;

            if (i >= 0) { // pointer for the first array
                d += arr1[i];
            }
            if (j >= 0) { // pointer for the second array
                d += arr2[j];
            }

            c = d / 10;
            d = d % 10;

            sum[k] = d; // assign the carry on d
            i--;
            j--;
            k--;

        }
        if (c != 0) {
            System.out.println(c); // print the carry
        }
        for (int val : sum) {
            System.out.println(val); // print the val
        }
    }
}
