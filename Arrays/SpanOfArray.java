
// import java.io.*;
import java.util.*;

public class SpanOfArray {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int index = 0; index < n; index++) {
            arr[index] = scn.nextInt();
        }
        int result = spanofarray(arr, n);
        System.out.println(result);
        scn.close();
    }

    public static int spanofarray(int arr[], int n) {

        int max = arr[0];
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
                // return max;
            }
            if (arr[index] < min) {
                min = arr[index];
                // return min;
            }
        }
        int result = max - min;
        return result;
    }

}
// 6 --Array Size/no of input
// 15 --Index 0
// 30 --Index 1
// 40 --Index 2
// 4 --Index 3
// 11 --Index 4
// 9 --Index 5
// 36 -- Span = Max element in an Array- Min element in an array