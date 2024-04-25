import java.util.Scanner;

public class AddNumbersUsingFunction {
    public static void main(String[] args) {
        // System.out.println(SumOfNumbers(10, 20));
        System.out.println("Sum of two number is: " + SumOfNumbers());

    }

    public static int SumOfNumbers() {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scn.nextInt();

        int sum = num1 + num2;
        return sum;
        // System.out.println("Sum of Two number is: " + sum);

    }

}

/*
 * SumOfNumbers function is used to add two number. We are calling this function
 * from main function.
 */
