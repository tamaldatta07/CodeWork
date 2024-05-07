// import java.io.*;
import java.util.*;

public class SubArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //no of input or Size of Array
        int arr[] = new int[n]; 
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        SubArrayProblem(arr); //call the function
        scn.close();
    }

    public static void SubArrayProblem(int[] arr) {
        for (int i = 0; i < arr.length; i++) { //for index i
            for (int j = i; j < arr.length; j++) { // for index j
                for (int idx = i; idx <= j; idx++) { // for printing the values between i & j
                    System.out.print(arr[idx] + "\t");
                }
                System.out.println(); // go to new line
            }
        }

    }

}
// 3 --> No of Input
// 10 --> 1st Input
// 20 --> 2nd Input
// 30 --> 3rd Input
//Output
// 10
// 10      20
// 10      20      30
// 20
// 20      30
// 30