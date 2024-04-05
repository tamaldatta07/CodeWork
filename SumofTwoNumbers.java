import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = scn.nextInt(); // Take input for the first number

        System.out.print("Enter second number: ");
        int number2 = scn.nextInt(); // Take input for the second number

        int sum = number1 + number2; // Add two nummber
        System.out.println("Sum of two number is: " + sum); // print the result

        scn.close();
    }
}
