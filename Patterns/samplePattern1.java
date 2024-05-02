import java.util.Scanner;

public class samplePattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int row = 1, nspaces = n / 2, nstars = n - nspaces;
        while (row <= n) {
            for (int i = 1; i <= nspaces; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nstars; i++) {
                System.out.print("*\t");
            }
            System.out.println();
            row++;
        }
        scn.close();
    }
}
// 5
//                 *       *       *
//                 *       *       *
//                 *       *       *
//                 *       *       *
//                 *       *       *