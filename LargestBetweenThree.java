import java.util.Scanner;

public class LargestBetweenThree {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        // Q : Find the largest number between three
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println(max);
        scn.close();
    }
}
