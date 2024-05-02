import java.util.Scanner;

public class pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int row = 1, nspaces = n / 2, nstars = 1;
        while (row <= n) {
            for (int i = 1; i <= nspaces; i++) {
                if (row == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            for (int i = 1; i <= nstars; i++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (row <= n / 2) {
                nstars = nstars + 1;

            } else {
                nstars = nstars - 1;
            }
            scn.close();
            row++;
        }
    }
}
// 5
//                 *
//                 *       *        
// *       *       *       *       *
//                 *       *        
//                 *