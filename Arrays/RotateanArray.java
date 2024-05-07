import java.io.*;
// import java.util.*;

public class RotateanArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a, int low, int high) {
        while (low < high) {
            int ele = a[low];
            a[low] = a[high];
            a[high] = ele;

            low++;
            high--;
        }

    }

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // part 1
        reverse(a, 0, a.length - k - 1);
        // part 2
        reverse(a, a.length - k, a.length - 1);
        // full reverse
        reverse(a, 0, a.length - 1);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}
// 5 --> Size of Array
// 1
// 2
// 3
// 4
// 5
// 3 --> value of K
// 3 4 5 1 2 --Output 