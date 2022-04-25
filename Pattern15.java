import java.util.*;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int row = 1, nspaces = n / 2, nstars = 1, num = 1;

        while (row <= n) {
            // Code for each row
            for (int i = 1; i <= nspaces; i++) { //Spaces
                System.out.print("\t");
            }

            int temp = num;
            for (int i = 1; i <= nstars; i++) { //Numbers
                System.out.print(temp + "\t");
                if (i <= nstars / 2) {
                    temp = temp + 1;
                } else {
                    temp = temp - 1;
                }
            }
            System.out.println();

            // preparation of next loop
            if (row <= n / 2) { //First Half
                nspaces = nspaces - 1;
                nstars = nstars + 2;
                num = num + 1;
            } else { //Second Half
                nspaces = nspaces + 1;
                nstars = nstars - 2;
                num = num - 1; 
            }
            row++;
            scn.close();

        }

    }
}
// 5
//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1