import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(isPrime(n));
        scn.close();
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

/*
 * Prime number is a number that is greater than 1 and divided by 1 or itself
 * only. In other words, prime numbers can't be divided by other numbers than
 * itself or 1. For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 */