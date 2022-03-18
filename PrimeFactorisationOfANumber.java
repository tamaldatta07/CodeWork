
import java.util.*;

public class PrimeFactorisationOfANumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for (int fac = 2; fac * fac <= n; fac++) {
            while (n % fac == 0) {
                n = n / fac;
                System.out.print(fac + " ");
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
        scn.close();
    }
}



// 1. You are required to display the prime factorisation of a number.

// 2. Take as input a number n.

// 3. Print all its prime factors from smallest to largest.