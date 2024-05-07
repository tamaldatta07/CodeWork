
import java.io.*;
// import java.util.*;

public class inverseOfanArray {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static int[] inverse(int[] a) {
        int[] inv = new int[a.length];
        for (int index = 0; index < a.length; index++) {
            int val = a[index];
            inv[val] = index;
        }
        return inv;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] inv = inverse(a);
        display(inv);
    }

}

// 5 -->Size of Array
// 4 -->0 index
// 0 -->1 index
// 2 -->2 index
// 3 -->3 index
// 1 -->4 index

// 1
// 4
// 2
// 3
// 0