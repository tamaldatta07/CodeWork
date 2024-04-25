import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.println("Enter the Operator:");
            // Take input for operator
            char op = scn.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter two number:");

                // Take input for two number
                int num1 = scn.nextInt();
                int num2 = scn.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) { // Check the condition if num2 is 0 or not
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }

            } else if (op == 'x' || op == 'X') { // To terminate the program we have to use 'x' or 'X'
                break;
            } else {
                System.out.println("Invalid Question!!");
            }
            System.out.println(ans);
        }
        scn.close();
    }
}
