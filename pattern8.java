import java.util.*;

public class pattern8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int row = 1; row<= n; row++){
            for (int col = 1; col <= n; col++){
                if(row + col == n +1){
                    System.out.print("*   ");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}

// 5
//                                 *   
//                         *
//                 *
//         *
// *