// import java.util.*;

public class ArrayDemo {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];

        arr[0] = 55;
        arr[1] = 90;
        arr[2] = 37;
        arr[3] = 28;
        arr[4] = 87;

        swap(arr, 4, 2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
