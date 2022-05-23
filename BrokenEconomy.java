
// import java.io.*;
import java.util.*;

public class BrokenEconomy {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        scn.close();
        binarySearch(arr, k);
    }

    public static void binarySearch(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1;

        int ceil = 0, floor = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (k < arr[mid]) { // left,ceil
                hi = mid - 1;
                ceil = arr[mid];
            } else if (k > arr[mid]) { // right,floor
                lo = mid + 1;
                floor = arr[mid];
            } else { // element found
                     // System.out.println(arr[mid]);
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

}
// 10 --> Size of Array/No of elements
// 1 --> No 0 element
// 5 --> No 1 element
// 10 --> No 2 element
// 15 --> No 3 element
// 22 --> No 4 element
// 33 --> No 5 element
// 40 --> No 6 element
// 42 --> No 7 element
// 55 --> No 8 element
// 66 --> No 9 element
// 34 --> value of K
// 40 --> Ceil
// 33 --> Floor