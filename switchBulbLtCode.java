import java.util.Scanner;

public class switchBulbLtCode {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // int count = 0;
        for (int i = 1; i * i <= n; i++) {
            System.out.println(i * i);
            // count++;
            scn.close();
        }
        // return count;

    }
}
