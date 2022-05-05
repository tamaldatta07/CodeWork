import java.io.*;
// import java.util.*;

public class ReverseanArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void reverse(int[] a) {
        int low = 0, high = a.length - 1;
        // swap
        while (low < high) {
            int ele = a[low];
            a[low] = a[high];
            a[high] = ele;
            low++;
            high--;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        reverse(a);
        display(a); 
    }

}
// 5 --> Size of Array
// 1
// 2
// 3
// 4
// 5
// 5 4 3 2 1 --> Result