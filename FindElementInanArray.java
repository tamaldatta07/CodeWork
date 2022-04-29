// import java.io.*;
import java.util.*;
public class FindElementInanArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //no of elements in an Array
        int arr[] = new int[n]; // Inputs from user for array
        for (int index = 0; index <= n - 1; index++) {
            arr[index] = scn.nextInt();
        }
        int ele = scn.nextInt(); //finding element
        int result = find(arr, ele);
        System.out.println(result);
        scn.close();
    }

    public static int find(int arr[], int ele) {
        for (int index = 0; index <= arr.length - 1; index++) {
            if (arr[index] == ele) {
                return index; //Element found
            }
        }
        return -1; //element not found
    }

}
// 4 -- no of inputs
// 15 --index 0
// 30 --index 1
// 40 --index 2
// 4 --index 3
// 40 -- find the posistion
// 2 -- 40 is in 2 index