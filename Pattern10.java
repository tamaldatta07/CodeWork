import java.util.*;

public class Pattern10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int row = 1, nspaces = n / 2, nstars = 1;

        while (row <= n) {
            for (int i = 1; i <= nspaces; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nstars; i++) {
                if (i == 1 || i == nstars) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();

            // preparation of next loop
            if (row <= n / 2) {
                nspaces = nspaces - 1;
                nstars = nstars + 2;

            } else {
                nspaces = nspaces + 1;
                nstars = nstars - 2;

            }
            row++;
            scn.close();

        }

    }
}
// 5
//                 *
//         *               *        
// *                               *
//         *               *        
//                 *