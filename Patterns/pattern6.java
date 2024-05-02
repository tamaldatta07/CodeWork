import java.util.*;

public class pattern6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int nstars = n / 2 + 1, row = 1, nspaces = 1;

        while (row <= n) {
            // code for each row
            for (int i = 1; i <= nstars; i++) {
                System.out.print("*\t");
            }
            for (int i = 1; i <= nspaces; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nstars; i++) {
                System.out.print("*\t");
            }

            // move to next line
            System.out.println();

            // preparation for next row
            if (row <= n / 2) {
                nstars = nstars - 1;
                nspaces = nspaces + 2;
            } else {
                nstars = nstars + 1;
                nspaces = nspaces - 2;

            }
            row++;
            scn.close();
        }

    }
}

// 5
// *       *       *               *       *       *
// *       *                               *       *
// *                                               *
// *       *                               *       *
// *       *       *               *       *       *