import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int row = 1; row<=n; row++){
            int nst = row; //nst= no of star

            for(int i = 1; i <= nst; i++){
                System.out.print("*\t");
            }
        }
        System.out.println();
        scn.close();
    }
    
}

// n=4
// * 
// *  *
// *  *  *
// *  *  *  *