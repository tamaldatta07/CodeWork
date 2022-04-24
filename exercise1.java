import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.print("Input number: ");
        System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
        scn.close();
    }
     
}

// Accepts an integer (n) and computes the value of n+nn+nnn