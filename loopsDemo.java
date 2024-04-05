import java.util.Scanner;

public class loopsDemo {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        // int n = scn.nextInt();
        /*
         * Syntax of for loop
         * for(initialization; condition; increment/decrement){
         * //body
         * }
         */

        /*
         * for (int j = 1; j != 5; j++) {
         * System.out.println(j);
         * // j++;
         * }
         */

        /*
         * while loop demo
         * int i = 1;
         * while (i != 5) {
         * System.out.println(i);
         * i++;
         * }
         */

        // print numbers from 1 to 5
        // for (int i = 1; i <= 5; i++) {
        // // System.out.println("Hello World");
        // System.out.println(i);
        // }

        // print number from 1 to n
        /*
         * for (int i = 1; i <= n; i++) {
         * System.out.println(i + "");
         * }
         */

        // While Loop
        /*
         * Syntax
         * while(condition){
         * body
         * }
         */

        // int n = 1;

        /*
         * while (n <= 5) {
         * System.out.println("hello world");
         * n++;
         * }
         */

        // Do While loop
        /*
         * Syntax
         * do {
         * body
         * } while (condition);
         */
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
        scn.close();
    }
}
