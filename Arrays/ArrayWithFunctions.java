import java.util.Arrays;

public class ArrayWithFunctions {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 5, 8, 7 };
        System.out.println(Arrays.toString(nums));
        changeInArray(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void changeInArray(int[] arr) {
        arr[0] = 63;
    }
}
