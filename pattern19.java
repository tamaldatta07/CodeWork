import java.util.*;

public class pattern19 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (row == 1) { // A
                    if (col == n || (col >= 1 && col <= n / 2 + 1)) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (row > 1 && row < n / 2 + 1) { // B
                    if (col == n / 2 + 1 || col == n) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (row == n / 2 + 1) { // C
                    System.out.print("*\t");
                } else if (row > n / 2 + 1 && row < n) { // D
                    if (col == n / 2 + 1 || col == 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else if (row == n) { // E
                    if (col == 1 || (col >= n / 2 + 1 && col <= n)) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                }

            }
            System.out.println();
        }
        scn.close();

    }
}

// 7
// *       *       *       *                       *
//                         *                       *
//                         *                       *
// *       *       *       *       *       *       *
// *                       *
// *                       *
// *                       *       *       *       *