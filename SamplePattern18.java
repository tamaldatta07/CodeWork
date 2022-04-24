import java.util.*;
public class SamplePattern18 {
    public static void main(String[] args) {
        int n = scn.nextInt();

        int nst = n;
        int nsp = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= nst; j++) {
                System.out.print("*\t");
            }

            if (i <= n / 2) {
                nsp++;
                nst = nst - 2;
            } else {
                nsp--;
                nst = nst + 2;
            }
            System.out.println();

        }

    }

}
