//Find out how many times a number is getting repeated
//here n = 1385757879 and findout how many times 5 is repeated

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
        scn.close();
    }

}
