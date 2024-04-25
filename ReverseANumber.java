//Reverse the given number
//n = 12345 then output will be 54321

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;

            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        scn.close();
    }
}
