import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 1; row <= n; row++) {
            int nst = row; // nst= no of star
            int nsp = n - nst;

            for (int i = 1; i <= nsp; i++) {
                System.out.print(" \t");
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
        
        scn.close();
    }

}
// 5
//                                 *
//                         *       *
//                 *       *       *
//         *       *       *       *
// *       *       *       *       *


