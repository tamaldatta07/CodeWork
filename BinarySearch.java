
// import java.io.*;
import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        System.out.println(binarySearch(arr, k));
        scn.close();
    }

    public static int binarySearch(int arr[], int k) {
        int st = 0, ed = arr.length - 1;

        while (st <= ed) {
            int mid = (st + ed) / 2;

            if (arr[mid] < k) {
                st = mid + 1;
            } else if (arr[mid] > k) {
                ed = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}

// 5 --> Size of Array
// 10 --> --> No 0 element
// 20 --> No 1 element
// 30 --> No 2 element
// 35 --> No 3 element
// 40 --> No 4 element
// 15 --> Input
// -1 --> not available in the array that's why return -1. 